package com.soap.common_util.http_client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.codec.http.HttpResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.BoundRequestBuilder;
import org.asynchttpclient.Request;
import org.asynchttpclient.Response;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.asynchttpclient.Dsl.asyncHttpClient;
import static org.asynchttpclient.Dsl.config;

/**
 * @author yangfuzhao on 2021/9/27.
 * kafka2doris 客户端工具
 */
@Slf4j
public class DorisHttpClient {

    private static final AsyncHttpClient asyncHttpClient = asyncHttpClient(config().setKeepAlive(true).setMaxRedirects(10000));

    public static DorisLoadResult sendDoris(String label, String content, Optional<String> dorisMetricsColumns) throws Exception {
        String url = String.format("%s/%s/%s/_stream_load", Config.doris_http_url, Config.doris_db, Config.doris_table);
        Request request = getRequest(url, label, content, dorisMetricsColumns);
        Response response =  asyncHttpClient.executeRequest(request).get();
        return DorisUtil.mapper.readValue(response.getResponseBody(), new TypeReference<DorisLoadResult>() {});
    }

    private static Request getRequest(String url, String label, String content, Optional<String> dorisMetricsColumns){
        BoundRequestBuilder boundRequestBuilder = asyncHttpClient.preparePut(url).setBody(content)
                .setHeader("Expect", "100-continue")
                .setHeader("Authorization", basicAuthHeader())
                .setHeader("label", label)
                .setHeader("timeout", 60)
                .setHeader("max_filter_ratio", Config.doris_max_filter_ratio)
                .setFollowRedirect(true)
                .setRequestTimeout(300000) //300s
                .setReadTimeout(300000); //300s
        dorisMetricsColumns.ifPresent(dorisMetricsColumn -> boundRequestBuilder.setHeader("columns", dorisMetricsColumn));
        return boundRequestBuilder.build();
    }

    public static DorisLoadStatus getLoadStatus(String label) throws Exception {
        String url = String.format("%s/db/label/_state?db=%s&label=%s", Config.doris_http_url, Config.doris_db, label);
        Response response = asyncHttpClient.prepareGet(url)
                .setHeader("Authorization", basicAuthHeader())
                .setHeader("Expect", "100-continue")
                .setFollowRedirect(true)
                .execute().get();
        log.info(response.getResponseBody());

        if (response.getStatusCode() == HttpResponseStatus.NOT_FOUND.code()) {
            url = String.format("%s/%s/get_load_state?db=%s&label=%s", Config.doris_http_url, Config.doris_db, Config.doris_db, label);
        }
        response = asyncHttpClient.prepareGet(url)
                .setHeader("Authorization", basicAuthHeader())
                .setHeader("Expect", "100-continue")
                .setFollowRedirect(true)
                .execute().get();
        log.info(response.getResponseBody());
        return DorisUtil.mapper.readValue(response.getResponseBody(),new TypeReference<DorisLoadStatus>() {});
    }

    public static String getErrorLog(String url) throws Exception {
        Response response = asyncHttpClient.prepareGet(url)
                .setHeader("Authorization", basicAuthHeader())
                .setHeader("Expect", "100-continue")
                .setFollowRedirect(true)
                .execute().get();
        String errorLog = response.getResponseBody();
        log.error(errorLog);
        int limit = Math.min(errorLog.length(), 5000);
        return errorLog.substring(0, limit); //xm has the body size limit
    }

    private static String basicAuthHeader(){
        final String tobeEncode = Config.doris_user + ":" + Config.doris_pass;
        byte[] encoded = Base64.encodeBase64(tobeEncode.getBytes(StandardCharsets.UTF_8));
        return "Basic " + new String(encoded);
    }

    public static class DorisLoadStatus{
        private String state;
        private String status;
        private String msg;

        public String getState() {
            return state;
        }

        public String getStatus() {
            return status;
        }

        public String getMsg() {
            return msg;
        }

        public boolean isSuccessful() {
            return state.equals("VISIBLE") || state.equals("COMMITTED") ;
        }

        @Override
        public String toString() {
            return "state: " + state + " status: " + status + " msg: " + msg;
        }
    }

    public static class DorisLoadResult{
        @JsonProperty("Status")
        private String status;
        @JsonProperty("Message")
        private String message;
        @JsonProperty("NumberLoadedRows")
        private int numberLoadedRows;
        @JsonProperty("NumberFilteredRows")
        private int numberFilteredRows;
        @JsonProperty("LoadBytes")
        private int loadBytes;
        @JsonProperty("LoadTimeMs")
        private int loadTimeMs;
        @JsonProperty("ErrorURL")
        private String errorURL;
        @JsonProperty("Label")
        private String label;
        @JsonProperty("TxnId")
        private String txnId = "";

        public int getNumberLoadedRows() {
            return numberLoadedRows;
        }

        public String getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }

        public int getNumberFilteredRows() {
            return numberFilteredRows;
        }

        public int getLoadBytes() {
            return loadBytes;
        }

        public int getLoadTimeMs() {
            return loadTimeMs;
        }

        public String getErrorURL() {
            return errorURL;
        }

        public String getLabel() {
            return label;
        }

        public String getTxnId() {
            return txnId;
        }

        public boolean isSuccessful() {
            final String publishTimeoutString = "transaction commit successfully, BUT data will be visible later";

            //when all be done, the response is {"status":"FAILED","msg":"No backend alive."}
            //so the status will be null
            if (status == null) {
                return false;
            }

            return status.equals("Success") ||
                    (status.equals("Publish Timeout") && message.equals(publishTimeoutString));
        }

        @Override
        public String toString() {
            return "\nStatus: " + status
                    + "\nMessage: " + message
                    + "\nNumberLoadedRows: " + numberLoadedRows
                    + "\nNumberFilteredRows: " + numberFilteredRows
                    + "\nLoadBytes: " + loadBytes
                    + "\nLoadTimeMs: " + loadTimeMs
                    + "\nErrorURL: " + errorURL
                    + "\nLabel: " + label
                    + "\nTxnId: " + txnId;
        }
    }

    public static class DorisUtil{
        public static final String HOSTNAME;
        static {
            String hostName;
            try {
                hostName = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                hostName = "Unknown";
            }
            HOSTNAME = hostName;
        }

        public static String getLabel(long sequenceId) {
            return String.format("%d_%s_%s_%d", Config.kafka_topic_change_time, Config.doris_db, Config.doris_table, sequenceId);
        }

        public static Long getSequenceId(String label) {
            String[] splits = label.split("_");
            return Long.valueOf(splits[splits.length - 1]);
        }

        //get header "Date" for MT BA request
        public static String getAuthDate() {
            SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);
            df.setTimeZone(TimeZone.getTimeZone("GMT"));
            return df.format(new Date());
        }

        //get header "Authorization" for MT BA request
        public static String getAuthorization(String clientId, String clientSecret, String uri, String method,
                                              String date) {
            String stringToSign = method + " " + uri + "\n" + date;
            String signature = getSignature(stringToSign, clientSecret);

            return "MWS" + " " + clientId + ":" + signature;
        }

        private static String getSignature(String data, String secret) {
            String HMAC_SHA1_ALGORITHM = "HmacSHA1";
            String result;
            try {
                SecretKeySpec signingKey = new SecretKeySpec(secret.getBytes(), HMAC_SHA1_ALGORITHM);
                Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
                mac.init(signingKey);
                result = new String(Base64.encodeBase64(mac.doFinal(data.getBytes())));
            } catch (Exception e) {
                throw new RuntimeException("Failed to generate HMAC: " + e.getMessage());
            }
            return result;
        }

        public static void alertAndExit(Throwable e) {
            log.error(e.getMessage(), e);
//            DorisPub.SendXM(String.format("Doris-Load 报警：\n%s.%s 进程挂了\n%s\n异常： %s", Config.doris_db, Config.doris_table, HOSTNAME, e.getMessage()));
           // MTAlerter.send(String.format("\n%s.%s Doris-Load 挂了 %s", Config.doris_db, Config.doris_table, HOSTNAME));
            System.exit(1);
        }

        public static final ObjectMapper mapper = new ObjectMapper();

        public static ObjectMapper getMapper() {
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
            return mapper;
        }
    }

    public static class Config {

        @ConfField
        public static String doris_user = "admin@default_cluster"; //user@cluster
        @ConfField
        public static String doris_pass = "doris_mt_olap";

        //dev config
        @ConfField
        public static String doris_mysql_url = "jdbc:mysql://xh-data-palo-query-dev01.gh.sankuai.com:8080";
        //dev config
        @ConfField
        public static String doris_http_url = "http://xh-data-palo-query-dev01.gh.sankuai.com:8410/api";

        @ConfField
        public static String doris_env = "";
        @ConfField
        public static String doris_db = "";
        @ConfField
        public static String doris_table = "";
        @ConfField
        public static int doris_sender_threads = 1;
        @ConfField
        public static double doris_max_filter_ratio = 0.0;
        @ConfField
        public static double doris_send_interval = 15000; //15s
        @ConfField
        public static boolean doris_is_partition_time_auto_incr = false;

        @ConfField
        public static String mysql_table = "";
        @ConfField
        public static String mysql_user = "doris_w";
        @ConfField
        public static String mysql_pass = "T15aaOhHYebp6m"; //线上访问
        @ConfField
        public static String mysql_url = "jdbc:mysql://data-mysql-datamap-write.vip.sankuai.com:5002/doris?characterEncoding=UTF-8&useSSL=false";

        @ConfField
        public static boolean mysql_is_clear = false;

        /*
         * to support kafka topic change for the same doris table
         * when the kafka topic change, you should increase kafka_topic_change_time
         * and set mysql_is_clear to true
         */
        @ConfField
        public static int kafka_topic_change_time = 0;
        @ConfField
        public static int kafka_buffer_size = 150000;
        @ConfField
        public static String kafka_topic = "";
        @ConfField
        public static int kafka_partition_change_check_interval = 600000; //10 min
        /*
         * if true seekToBeginning, else seekToEnd
         */
        @ConfField
        public static boolean kafka_is_use_earliest_offset = false;

        @ConfField
        public static boolean kafka_seek_next_offset = true;

        @ConfField
        public static String[] alter_admin_receivers = {"gaodayue", "wangbo36", "liulijia", "mayue13"};

        @ConfField
        public static String[] bitmap_hash_columns = {};

        @ConfField
        public static String[] alter_user_receivers = {""};
        @ConfField
        public static String alter_channel = "sms";

        /**
         * Config for truncate some timestamp columns to coarse-grained time
         * [{"from": "columnA", "to": [{"column": "columnA1", "type": "posix", "granularity": "PT1H"}, {"column": "columnA2", "type": "joda", "format": "yyyyMMdd", "granularity": "P1D"}]}]
         */
        @ConfField
        public static String time_column_derivation = "";

        @Retention(RetentionPolicy.RUNTIME)
        public static @interface ConfField {
            String value() default "";
        }

        public static Properties props;
        public static Class<? extends Config> confClass;

        public void init(String propfile) throws Exception {
            props = new Properties();
            confClass = this.getClass();
            props.load(new FileReader(propfile));
            setFields();
        }

        public static HashMap<String, String> dump() throws Exception {
            HashMap<String, String> map = new HashMap<String, String>();
            Field[] fields = confClass.getFields();
            for (Field f : fields) {
                if (f.getAnnotation(ConfField.class) == null) {
                    continue;
                }
                if (f.getType().isArray()) {
                    switch (f.getType().getSimpleName()) {
                        case "short[]":
                            map.put(f.getName(), Arrays.toString((short[]) f.get(null)));
                            break;
                        case "int[]":
                            map.put(f.getName(), Arrays.toString((int[]) f.get(null)));
                            break;
                        case "long[]":
                            map.put(f.getName(), Arrays.toString((long[]) f.get(null)));
                            break;
                        case "double[]":
                            map.put(f.getName(), Arrays.toString((double[]) f.get(null)));
                            break;
                        case "boolean[]":
                            map.put(f.getName(), Arrays.toString((boolean[]) f.get(null)));
                            break;
                        case "String[]":
                            map.put(f.getName(), Arrays.toString((String[]) f.get(null)));
                            break;
                        default:
                            throw new Exception("unknown type: " + f.getType().getSimpleName());
                    }
                } else {
                    map.put(f.getName(), f.get(null).toString());
                }
            }
            return map;
        }

        private static void setFields() throws Exception {
            Field[] fields = confClass.getFields();
            for (Field f : fields) {
                // ensure that field has "@ConfField" annotation
                ConfField anno = f.getAnnotation(ConfField.class);
                if (anno == null) {
                    continue;
                }

                // ensure that field has property string
                String confKey = anno.value().equals("") ? f.getName() : anno.value();
                String confVal = props.getProperty(confKey);
                if (confVal == null) {
                    continue;
                }

                setConfigField(f, confVal);
            }
        }

        public static void setConfigField(Field f, String confVal) throws IllegalAccessException, Exception {
            confVal = confVal.trim();

            String[] sa = confVal.split(",");
            for (int i = 0; i < sa.length; i++) {
                sa[i] = sa[i].trim();
            }

            // set config field
            switch (f.getType().getSimpleName()) {
                case "short":
                    f.setShort(null, Short.parseShort(confVal));
                    break;
                case "int":
                    f.setInt(null, Integer.parseInt(confVal));
                    break;
                case "long":
                    f.setLong(null, Long.parseLong(confVal));
                    break;
                case "double":
                    f.setDouble(null, Double.parseDouble(confVal));
                    break;
                case "boolean":
                    f.setBoolean(null, Boolean.parseBoolean(confVal));
                    break;
                case "String":
                    f.set(null, confVal);
                    break;
                case "short[]":
                    short[] sha = new short[sa.length];
                    for (int i = 0; i < sha.length; i++) {
                        sha[i] = Short.parseShort(sa[i]);
                    }
                    f.set(null, sha);
                    break;
                case "int[]":
                    int[] ia = new int[sa.length];
                    for (int i = 0; i < ia.length; i++) {
                        ia[i] = Integer.parseInt(sa[i]);
                    }
                    f.set(null, ia);
                    break;
                case "long[]":
                    long[] la = new long[sa.length];
                    for (int i = 0; i < la.length; i++) {
                        la[i] = Long.parseLong(sa[i]);
                    }
                    f.set(null, la);
                    break;
                case "double[]":
                    double[] da = new double[sa.length];
                    for (int i = 0; i < da.length; i++) {
                        da[i] = Double.parseDouble(sa[i]);
                    }
                    f.set(null, da);
                    break;
                case "boolean[]":
                    boolean[] ba = new boolean[sa.length];
                    for (int i = 0; i < ba.length; i++) {
                        ba[i] = Boolean.parseBoolean(sa[i]);
                    }
                    f.set(null, ba);
                    break;
                case "String[]":
                    f.set(null, sa);
                    break;
                default:
                    throw new Exception("unknown type: " + f.getType().getSimpleName());
            }
        }
    }
}
