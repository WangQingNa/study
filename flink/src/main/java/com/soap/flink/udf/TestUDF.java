package com.soap.flink.udf;

import org.apache.flink.calcite.shaded.com.google.common.collect.Lists;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

import static org.apache.flink.table.api.Expressions.$;

/**
 * @author yangfuzhao on 2021/6/2.
 */
public class TestUDF {

    public static void main(String[] args) {
        /************************
         // 使用 Blink Streaming
         //************************/
        StreamExecutionEnvironment bsEnv = StreamExecutionEnvironment.getExecutionEnvironment();
        EnvironmentSettings bsSettings = EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build();
        StreamTableEnvironment bsTableEnv = StreamTableEnvironment.create(bsEnv, bsSettings);
        DataStreamSource<Integer> dss = bsEnv.fromCollection(Lists.newArrayList(1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 4, 33, 3, 5, 743, 2));
        bsTableEnv.createTemporaryView("myTable",dss,$("a"));

        /************************
         * 使用步骤
         * 1.定义 udf 可以重写open 获得FunctionContext
         * 2.注册 udf 函数名称不区分大小写
         * 3.使用 udf
        ************************/
//        bsTableEnv.createTemporarySystemFunction("myFunction",new MyScalarUDF());
        bsTableEnv.createTemporarySystemFunction("MyFunction",new MyTableFunc());

        /************************
         * Note: 同一级别函数名称不能重复，不区分大小写
         *
        ************************/

//        Table table = bsTableEnv.sqlQuery("select myFunction(a) as a from myTable");

        /************************
         * Table Function
         * 1.eval 方法中可以多次执行 collect
         * 2.输出多字段或复杂类型时需要用 @FunctionHint(output = @DataTypeHint("ROW< i INT, s STRING >")) 标记
         * 3.使用 LATERAL TABLE(split(a)) as T(s) : T(s)  表名和字段映射,T为表别名 ()中为字段，需要按照顺序对应，数量需要一致
         *
        ************************/
        Table table = bsTableEnv.sqlQuery("select myTable.a,t.q from myTable ,LATERAL TABLE(myFunction(a)) as t(q,s)");
        table.execute().collect().forEachRemaining(System.out::println);

    }
}
