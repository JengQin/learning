package com.jeng.kafka.producer;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ProducerDemo2 {
    private static String msg = "{\"user_id\": \"userId\", \"item_id\":\"itemId\", \"event\": \"behavior\", \"ts\": \"ts_str\", \"server_time\": \"server_time_str\"}";
    private static String[] userIds = {"user_01", "user_02", "user_03", "user_04"};
    private static String[] itemIds = {"1001", "1002", "1003"};
    private static String[] events = {"login", "order", "active", "create_role", "enter_game"};
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        Map<String, Object> conf = initConf();

        String topic = "producer_demo_2";

        KafkaProducer<String, String> producer = new KafkaProducer<>(conf, new StringSerializer(), new StringSerializer());

        int count = 0;
        while (true) {
            count++;
            long ts = System.currentTimeMillis();
            String server_time = sdf.format(new Date(ts));
            String key = userIds[count % userIds.length];
            String value = msg.replace("userId",userIds[count % userIds.length])
                    .replace("itemId",itemIds[count % itemIds.length])
                    .replace("behavior",events[count % events.length])
                    .replace("ts_str",ts+"")
                    .replace("server_time_str", server_time);

            ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, value);

            producer.send(record, new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                    System.out.print("\ttopic="+recordMetadata.topic());
                    System.out.print("\tpartition="+recordMetadata.partition());
                    System.out.print("\toffset="+recordMetadata.offset());
                    System.out.println();
                }
            });

            Thread.sleep(1000);
        }
    }

    private static Map<String, Object> initConf() {
        HashMap<String, Object> conf = new HashMap<>();
        conf.put("bootstrap.servers", "master1.com:9092,core1.com:9092");
        conf.put("acks", "all");
        conf.put("retries", "3");
        conf.put("retries", "3");
        return conf;
    }
}
