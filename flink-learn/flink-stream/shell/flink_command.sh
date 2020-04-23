#!/usr/bin/env bash

flink/bin/yarn-session.sh -jm 2G -tm 2G

flink/bin/flink run -d -c com.jeng.flink.checkpoint.CheckPointTest2 jars/flink-stream-1.0.jar


flink/bin/flink cancel -s hdfs://jhcluster/flink-test/savepoints 1c87748e1eded564a0c89e88a747434e
flink/bin/flink run -d -s hdfs://jhcluster/flink-test/savepoints/1c87748e1eded564a0c89e88a747434e -c com.jeng.flink.checkpoint.CheckPointTest2 jars/flink-stream-1.0.jar
