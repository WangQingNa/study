package com.soap.flink.sql;

import com.soap.flink.hotgoods.HotGoods;
import org.apache.flink.api.common.time.Time;
import org.apache.flink.calcite.shaded.com.google.common.collect.Lists;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.ExecutionCheckpointingOptions;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.*;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.catalog.Catalog;
import org.apache.flink.table.catalog.GenericInMemoryCatalog;
import org.apache.flink.table.descriptors.FileSystem;
import org.apache.flink.table.descriptors.OldCsv;
import org.apache.flink.table.descriptors.Schema;
import org.apache.flink.table.types.DataType;

import java.time.Duration;

import static org.apache.flink.table.api.Expressions.$;

/**
 * @author yangfuzhao on 2021/5/25.
 */
public class SqlAPI {
    public static void main(String[] args) throws Exception {

        /************************
        // 使用 Blink Streaming
        //************************/
        StreamExecutionEnvironment bsEnv = StreamExecutionEnvironment.getExecutionEnvironment();
        EnvironmentSettings bsSettings = EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build();
        StreamTableEnvironment bsTableEnv = StreamTableEnvironment.create(bsEnv, bsSettings);


        /************************
         * 通过一下方式设置参数TableConfig
         * setIdleStateRetentionTime 控制任务状态
         * 空闲时间(没有修改操作)小于minTime的数据不会被清理
         * 空闲时间(没有修改操作)大于maxTime的数据会被清理
         * maxTime 和 minTime之间必须大于5分钟？？？
        ************************/
        TableConfig tableConfig = bsTableEnv.getConfig();
        tableConfig.setIdleStateRetentionTime(Time.minutes(1),Time.minutes(1));

        /************************
         * 通过TableConfig设置checkpoint
         *
        ************************/
        bsTableEnv.getConfig().getConfiguration().set(
                ExecutionCheckpointingOptions.CHECKPOINTING_MODE, CheckpointingMode.EXACTLY_ONCE);
        bsTableEnv.getConfig().getConfiguration().set(
                ExecutionCheckpointingOptions.CHECKPOINTING_INTERVAL, Duration.ofSeconds(10));

        /************************
         * 1.使用 catalog前需要先注册
         * 2.不可用注册同名的 catalog
         * 3.
        ************************/
        bsTableEnv.registerCatalog("test_catalog", new GenericInMemoryCatalog("test_catalog"));
//        bsTableEnv.registerCatalog("test_catalog1", new GenericInMemoryCatalog("test_catalog"));

        bsTableEnv.useCatalog("test_catalog");
        Schema schema = new Schema()
                .field("userId", DataTypes.BIGINT())
                .field("itemId",DataTypes.BIGINT())
                .field("categoryId",DataTypes.INT())
                .field("behavior",DataTypes.STRING())
                .field("timestamp",DataTypes.BIGINT());

        bsTableEnv.connect(new FileSystem().path("/Users/soapy/IdeaProjects/study/flink/src/main/resources/UserBehav.csv"))
                .withFormat(new OldCsv().fieldDelimiter(","))
                .withSchema(schema)
                .createTemporaryTable("MyTable");

        /************************
         * 不会执行
         * StreamTableEnvironment.sqlQuery
        ************************/
        Table table =  bsTableEnv.sqlQuery("select * from MyTable where userId = 1000001");

        /************************
         * 只执行一次
         * StreamTableEnvironment.executeSql
        ************************/
//        bsTableEnv.executeSql("select * from MyTable where userId = 1000001");

        /************************
         * 只执行一次
         * Table.execute 在本地client
         * Table.executeInsert
        ************************/
//        table.execute();

//        table.executeInsert("");

        /************************
         * DateStream to Table
         * StreamTableEnvironment.createTemporaryView path:表的唯一标识
         * 可以使用 $ flink 表达式
        ************************/

        DataStreamSource<Integer> dss = bsEnv.fromCollection(Lists.newArrayList(1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 4, 33, 3, 5, 743, 2));
        bsTableEnv.createTemporaryView("myTable",dss,$("a"));



//        table.executeInsert();
//        table.execute();

//        bsTableEnv.executeSql("select * from MyTable").print();

        DataStream<HotGoods.UserBehavior> ubds = bsTableEnv.toAppendStream(table, HotGoods.UserBehavior.class);
        ubds.keyBy(HotGoods.UserBehavior::getUserId)

                .print("sss");

        /************************
         * Time Attributes
         * 三种方式设置时间属性
         * 1.创建表时
         * 2.DataStream 转换为 Table时
         * 3.使用TableSource时
        ************************/

        bsTableEnv.fromDataStream(ubds,$("a"),$("user_pro_time").proctime());


//
        bsEnv.execute("");
    }
}
