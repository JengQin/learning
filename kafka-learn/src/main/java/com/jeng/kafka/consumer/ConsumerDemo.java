package com.jeng.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.HashMap;
import java.util.Properties;

public class ConsumerDemo {
    private static String topic = "producer_demo_2";
    private static String consumerGroup="ooxx01";
    public static void main(String[] args) {
        Properties conf = initConf();
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(conf, new StringDeserializer(), new StringDeserializer());

        consumer.su
    }

    private static Properties initConf() {
        Properties conf = new Properties();
        conf.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "master1.com:9092");
        conf.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        conf.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        conf.put("auto.offset.reset", "earliest");
        conf.put("enable.auto.commit", "false");
        conf.put("group.id", consumerGroup);
        conf.put("max.poll.records", "1");

        return null;
    }
}
