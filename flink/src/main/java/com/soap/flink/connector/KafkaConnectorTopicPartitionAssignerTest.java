package com.soap.flink.connector;

import org.apache.flink.streaming.connectors.kafka.internals.KafkaTopicPartition;
import org.apache.flink.streaming.connectors.kafka.internals.KafkaTopicPartitionAssigner;

/**
 * @author yangfuzhao on 2021/9/7.
 */
public class KafkaConnectorTopicPartitionAssignerTest {
    public static void main(String[] args) {
        KafkaTopicPartition partition1 = new KafkaTopicPartition("aa",0);
        KafkaTopicPartition partition2 = new KafkaTopicPartition("aa",1);
        KafkaTopicPartition partition3 = new KafkaTopicPartition("aa",2);
        KafkaTopicPartition partition4 = new KafkaTopicPartition("bbbb",0);
        KafkaTopicPartition partition5 = new KafkaTopicPartition("bbbb",1);
        int assign1 = KafkaTopicPartitionAssigner.assign(partition1, 4);
        System.out.println("assign1:"+assign1);
        int assign2 = KafkaTopicPartitionAssigner.assign(partition2, 4);
        System.out.println("assign2:"+assign2);
        int assign3 = KafkaTopicPartitionAssigner.assign(partition3, 4);
        System.out.println("assign3:"+assign3);
        int assign4 = KafkaTopicPartitionAssigner.assign(partition4, 4);
        System.out.println("assign4:"+assign4);
        int assign5 = KafkaTopicPartitionAssigner.assign(partition5, 4);
        System.out.println("assign5:"+assign5);
//        int assign4 = KafkaTopicPartitionAssigner.assign(partition, 4);
    }
}
