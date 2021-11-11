package com.soap.flink.connector;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.shaded.guava18.com.google.common.collect.Maps;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.internals.KafkaTopicPartition;

import java.util.Map;
import java.util.Properties;

/**
 * @author yangfuzhao on 2021/6/2.
 */
public class KafkaConnector {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "localhost:9092");
        properties.setProperty("group.id", "test");
        FlinkKafkaConsumer<String> topic = new FlinkKafkaConsumer<>("topic", new SimpleStringSchema(), properties);
        topic.setStartFromEarliest();     //最旧 从savepoint 或 chk 重启时无效
        topic.setStartFromLatest();       //最新 从savepoint 或 chk 重启时无效
        topic.setStartFromTimestamp(1111111); //指定时间戳 必须是当前时间之前，如果在最旧offset前，则从最近消费，chk重启时无效
        topic.setStartFromGroupOffsets(); // the default behaviour
        Map<KafkaTopicPartition, Long> specificStartupOffsets = Maps.newHashMap();
        topic.setStartFromSpecificOffsets(specificStartupOffsets); // 不同分区分别指定offset

        DataStream<String> stream = env.addSource(topic);

        /**
         * 支持正则匹配topic
         * 需要设置 flink.partition-discovery.interval-millis 为大于0的整数
         */
        FlinkKafkaConsumer<String> myConsumer = new FlinkKafkaConsumer<>(
                java.util.regex.Pattern.compile("test-topic-[0-9]"),
                new SimpleStringSchema(),
                properties);


    }
}
