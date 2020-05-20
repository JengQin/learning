#!/usr/bin/env bash


kafka-console-consumer.sh --bootstrap-server node1:9092 --topic src_event_all --from-beginning

kafka-console-producer.sh --broker-list node1:9092 --topic src_event_all


kafka-consumer-groups.sh --bootstrap-server node1:9092 --list


kafka-topics.sh --create --zookeeper node1:2181/kafka \
--partitions 3 \
--replication-factor 2 \
--topic src_event_all \
--config delete.retention.ms=259200000 \
--config retention.ms=259200000
