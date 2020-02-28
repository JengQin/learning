package com.jeng.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.HashMap;
import java.util.Map;

public class ProducerDemo {
    public static void main(String[] args) {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("bootstrap.servers","hadoop1:9092");
        Producer<String, String> producer = new KafkaProducer<String, String>(props,new StringSerializer(),new StringSerializer());
        producer.send(new ProducerRecord<String, String>("test_2020", "kafka,0.11,learning,2020-02-28"));
        producer.close();
    }
}
