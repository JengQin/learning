package com.jeng.flink.apitest.sourcetest

import java.util.Properties

import org.apache.flink.api.common.serialization.SimpleStringSchema
import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer011

object KafkaSourceTest {

  def main(args: Array[String]): Unit = {
    /*
    1.引入依赖flink-connector-kafka-0.11_2.11
    2.env.addSource(new FlinkKafkaConsumer011)
     */
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    env.setParallelism(3)

    val prop = new Properties()
    prop.put("bootstrap.servers","node1:9092,node2:9092,node3:9092")
    prop.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer")
    prop.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer")
    prop.put("auto.offset.reset","earliest")
    prop.put("enable.auto.commit","true")
    prop.put("group.id","flink_kafka_source_test")
    prop.put("max.poll.records","1")

    val inputStream = env.addSource(new FlinkKafkaConsumer011[String]("src_event_all",new SimpleStringSchema(),prop))

    inputStream.print()

    env.execute("Flink Kafka Source Test")

  }

}
