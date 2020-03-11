package com.jeng.kafka.producer;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.HashMap;
import java.util.Map;

public class ProducerDemo {
    public static void main(String[] args) {
        Map<String, Object> props = initProperty();

        Producer<String, String> producer = new KafkaProducer<String, String>(props,new StringSerializer(),new StringSerializer());
        producer.send(new ProducerRecord<String, String>("test_2020", "kafka,0.11,learning,2020-02-28"));
        producer.send(new ProducerRecord<String, String>("test_2020", "kafka,0.11,learning,2020-03-11"), new Callback() {
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                System.out.println("offset="+recordMetadata.offset());
                System.out.println("partition="+recordMetadata.partition());
                System.out.println("serializedKeySize="+recordMetadata.serializedKeySize());
                System.out.println("serializedValueSize="+recordMetadata.serializedValueSize());
                System.out.println("topic="+recordMetadata.topic());

                System.out.println(e.getMessage());
            }
        });
        producer.close();
    }

    private static Map<String, Object> initProperty() {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("bootstrap.servers","hadoop1:9092");
        props.put("acks","all");
        props.put("retries","3");
        return props;
    }
}
