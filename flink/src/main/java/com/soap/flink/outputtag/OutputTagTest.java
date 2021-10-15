package com.soap.flink.outputtag;

import org.apache.flink.api.common.typeinfo.BasicTypeInfo;
import org.apache.flink.calcite.shaded.com.google.common.collect.Lists;;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.ProcessFunction;
import org.apache.flink.util.Collector;
import org.apache.flink.util.OutputTag;

import java.util.Arrays;

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
        env.setMaxParallelism(1);
        env.setParallelism(1);
        DataStreamSource<Integer> dataStreamSource = env.fromCollection(Lists.newArrayList(1, 1, 2,1,2,3,4,5,6,4));
        OutputTag<String> ots = new OutputTag<>("string_tag", BasicTypeInfo.STRING_TYPE_INFO);
        OutputTag<Integer> oti = new OutputTag<Integer>("integer_tag"){};

        SingleOutputStreamOperator<Object> process = dataStreamSource.process(new ProcessFunction<Integer, Object>() {
            @Override
            public void processElement(Integer value, Context ctx, Collector<Object> out) throws Exception {
                if (value.equals(1)) {
                    ctx.output(ots, String.valueOf(value));
                } else {
                    ctx.output(oti, value);
                }
            }
        });

        DataStream<Integer> sideOutputInt = process.getSideOutput(oti);
        DataStream<String> sideOutputStr = process.getSideOutput(ots);
        sideOutputInt.print("int:");
        sideOutputStr.print("str:");

//        sideOutputInt.union(sideOutputStr);

//        sideOutputInt.connect(sideOutputStr);

        //不推荐使用
//        OutputSelector os = new OutputSelector<Integer>(){
//            @Override
//            public Iterable<String> select(Integer value) {
//                if (value.equals(1)) {
//                    return Arrays.asList("1");
//                } else {
//                    return Arrays.asList("2","3","4");
//                }
//            }
//        };
//
//        dataStreamSource.split(os).select("2").print("split:");

        env.execute("a");
    }
}
