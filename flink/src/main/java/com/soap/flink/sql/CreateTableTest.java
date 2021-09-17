package com.soap.flink.sql;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.catalog.GenericInMemoryCatalog;

/**
 * @author yangfuzhao on 2021/7/4.
 */
public class CreateTableTest {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment bsEnv = StreamExecutionEnvironment.getExecutionEnvironment();
        EnvironmentSettings bsSettings = EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build();
        StreamTableEnvironment bsTableEnv = StreamTableEnvironment.create(bsEnv, bsSettings);

        bsTableEnv.registerCatalog("soap", new GenericInMemoryCatalog("soap"));

        bsTableEnv.useCatalog("soap");
        bsTableEnv.useDatabase("soap_db");
        Table table = bsTableEnv.fromValues("a", "b");

        bsTableEnv.createTemporaryView("soap", table);

        bsTableEnv.executeSql("select * from soap").print();


        bsEnv.execute("sql");


    }
}
