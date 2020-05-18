#!/usr/bin/env bash


kafka-console-consumer.sh --bootstrap-server master1:9092 --topic ooxx --from-beginning

kafka-console-producer.sh --broker-list master1:9092 --topic ooxx


kafka-consumer-groups.sh --bootstrap-server master1:9092 --list