package com.soap.flink.connector;

import com.alibaba.ververica.cdc.connectors.mysql.MySQLSource;
import com.alibaba.ververica.cdc.connectors.mysql.table.StartupOptions;
import com.alibaba.ververica.cdc.debezium.DebeziumSourceFunction;
import com.alibaba.ververica.cdc.debezium.StringDebeziumDeserializationSchema;

import com.google.common.collect.Lists;
import lombok.val;
import lombok.var;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.ConfigOption;
import org.apache.flink.configuration.ConfigOptions;
import org.apache.flink.runtime.state.filesystem.FsStateBackend;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import scala.reflect.io.Directory;


import org.apache.flink.configuration.Configuration;
import java.io.File;
import java.util.*;

/**
 * @author yangfuzhao on 2021/11/11.
 */
public class MySqlCdc {

    public static void main(String[] args) throws Exception {

        DebeziumSourceFunction<String> build = MySQLSource.<String>builder()
                .hostname("127.0.0.1")
                .port(3306)
                .databaseList("or_test")
//                .tableList("person")
                .tableList("or_test.person")
                .username("root")
                .password("123456")
                .deserializer(new StringDebeziumDeserializationSchema())
                .startupOptions(StartupOptions.initial())
                .build();
        ParameterTool tool = ParameterTool.fromArgs(args);
        Configuration envCfg = new Configuration();

        String checkPointDirPath = tool.get("execution.savepoint.path");
        envCfg.setString("execution.savepoint.path",checkPointDirPath);

        File file = new File(checkPointDirPath);
        final Comparator<File> comparator = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return Long.valueOf(o1.lastModified()).compareTo(Long.valueOf(o2.lastModified()));
            }
        };

        String[] strings = new String[args.length + 2];

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            Optional<File> max = Arrays.stream(files).max((f1, f2) -> comparator.compare(f1, f2));
            File lastFile = max.get();
            String absolutePath1 = Arrays.stream(lastFile.listFiles()).filter(name -> name.getName().startsWith("chk-")).max((f11, f21) -> comparator.compare(f11, f21)).get().getAbsolutePath();
            for (int i = 0; i < args.length; i++) {
                strings[i] = args[i];
            }
            strings[strings.length - 2] = "--last.checkpoint";
            strings[strings.length - 1] = absolutePath1;
            tool = ParameterTool.fromArgs(strings);
//            ff2a0d44756d5a23594a70733bd74251
        }

        StreamExecutionEnvironment env =  StreamExecutionEnvironment.getExecutionEnvironment(envCfg) ; StreamExecutionEnvironment.getExecutionEnvironment(envCfg);
        env.getConfig().setGlobalJobParameters(tool);

        env.setStateBackend(new FsStateBackend("file://"+checkPointDirPath));

        // enable checkpoint
//        env.enableCheckpointing(3000);
        env.enableCheckpointing(30000, CheckpointingMode.EXACTLY_ONCE);

        env.addSource(build,"MySQL Source")
                .setParallelism(1) // 为啥不能大于1
                .print("#####")
                .setParallelism(1);

        env.execute("Print MySQL Snapshot + Binlog");


    }

}
