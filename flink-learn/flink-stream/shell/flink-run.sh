#!/usr/bin/env bash

source "$(dirname "$0")"/env.sh

PROJECT_DIR=`pwd`
#$FLINK_DIR/bin/flink run -d -c com.jeng.flink.state.KeyedValueState ${WORK_SPACE}/jars/flink-stream-1.0.jar
#$FLINK_DIR/bin/flink run -m yarn-cluster -c com.jeng.flink.state.KeyedValueState ${WORK_SPACE}/jars/flink-stream-1.0.jar
#$FLINK_DIR/bin/flink run -m yarn-cluster -c com.jeng.flink.checkpoint.CheckPointTest ${WORK_SPACE}/jars/flink-stream-1.0.jar
#$FLINK_DIR/bin/flink run -d -c com.jeng.flink.checkpoint.CheckPointTest2 ${WORK_SPACE}/jars/flink-stream-1.0.jar
#$FLINK_DIR/bin/flink run -d -s hdfs://jhcluster/flink-test/checkpoints/8c9097e628bc88e05b53f8350c3a230b/chk-31/_metadata -c com.jeng.flink.checkpoint.CheckPointTest2 ${WORK_SPACE}/jars/flink-stream-1.0.jar
$FLINK_DIR/bin/flink run -d -c com.jeng.flink.checkpoint.CheckPointTest2 ${WORK_SPACE}/jars/flink-stream-1.0.jar
#flink/bin/flink run -d -c com.jeng.flink.checkpoint.CheckPointTest2 ./jars/flink-stream-1.0.jar