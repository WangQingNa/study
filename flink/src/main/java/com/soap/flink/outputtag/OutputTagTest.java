package com.soap.flink.outputtag;

import org.apache.flink.api.common.typeinfo.BasicTypeInfo;
import org.apache.flink.calcite.shaded.com.google.common.collect.Lists;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.ProcessFunction;
import org.apache.flink.util.Collector;
import org.apache.flink.util.OutputTag;

/**
 * @author yangfuzhao on 2021/5/24.
 */
public class OutputTagTest {

    /**
     * OutputTag 必须创建匿名的内部类，指定类型 或者 创建时设置TypeInformation参数
     * id 必须唯一
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStreamSource<Integer> dataStreamSource = env.fromCollection(Lists.newArrayList(1, 1, 2,1,2));
//        OutputTag<String> ots = new OutputTag<String>("string_tag"){};
        OutputTag<String> ots = new OutputTag<>("string_tag", BasicTypeInfo.STRING_TYPE_INFO);
        OutputTag<Integer> oti = new OutputTag<Integer>("string_tag"){};
        SingleOutputStreamOperator<Object> process = dataStreamSource.process(new ProcessFunction<Integer, Object>() {
            @Override
            public void processElement(Integer value, Context ctx, Collector<Object> out) throws Exception {
                if (value.equals(1)) {
                    ctx.output(ots, String.valueOf(value));
                } else if (value.equals(2)) {
                    ctx.output(oti, value);
                }
            }
        });
        DataStream<Integer> sideOutputInt = process.getSideOutput(oti);
        DataStream<String > sideOutputStr = process.getSideOutput(ots);
        sideOutputInt.print("int:");
        sideOutputStr.print("str:");

        env.execute("a");
    }
}
