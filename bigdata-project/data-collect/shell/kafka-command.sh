#!/usr/bin/env bash


kafka-console-consumer.sh --bootstrap-server master1:9092 --topic ooxx --from-beginning

kafka-console-producer.sh --broker-list master1:9092 --topic ooxx


kafka-consumer-groups.sh --bootstrap-server master1:9092 --list


kafka-topics.sh --create --zookeeper master1:2181/kafka \
--partitions 3 \
--replication-factor 2 \
--topic src_event_all \
--config delete.retention.ms=259200000 \
--config retention.ms=259200000
