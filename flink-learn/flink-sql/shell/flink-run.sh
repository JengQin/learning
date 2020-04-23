#!/usr/bin/env bash
################################################################################
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
################################################################################

source "$(dirname "$0")"/env.sh

PROJECT_DIR=`pwd`
#$FLINK_DIR/bin/flink run -d -c com.jeng.flink.state.KeyedValueState ${WORK_SPACE}/jars/flink-learn-1.0.jar
#$FLINK_DIR/bin/flink run -m yarn-cluster -c com.jeng.flink.state.KeyedValueState ${WORK_SPACE}/jars/flink-learn-1.0.jar
#$FLINK_DIR/bin/flink run -m yarn-cluster -c com.jeng.flink.checkpoint.CheckPointTest ${WORK_SPACE}/jars/flink-learn-1.0.jar
#$FLINK_DIR/bin/flink run -d -c com.jeng.flink.checkpoint.CheckPointTest2 ${WORK_SPACE}/jars/flink-learn-1.0.jar
#$FLINK_DIR/bin/flink run -d -s hdfs://jhcluster/flink-test/checkpoints/8c9097e628bc88e05b53f8350c3a230b/chk-31/_metadata -c com.jeng.flink.checkpoint.CheckPointTest2 ${WORK_SPACE}/jars/flink-learn-1.0.jar
#flink/bin/flink run -d -c com.jeng.flink.checkpoint.CheckPointTest2 ./jars/flink-learn-1.0.jar