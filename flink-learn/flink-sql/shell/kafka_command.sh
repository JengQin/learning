--create --zookeeper hadoop1:2181 --partitions 3 --replication-factor 1 --topic user_behavior --config delete.retention.ms=86400000 --config retention.ms=86400000


bin/kafka-console-consumer.sh --bootstrap-server hadoop1:6667 --topic user_behavior --from-beginning

--create --zookeeper hadoop1:2181 --partitions 3 --replication-factor 1 --topic flink_keyed_value_state_test --config delete.retention.ms=86400000 --config retention.ms=86400000
/usr/hdp/current/kafka-broker/bin/kafka-topics.sh --create --zookeeper hadoop1:2181 --partitions 3 --replication-factor 1 --topic flink_checkpoint_test --config delete.retention.ms=86400000 --config retention.ms=86400000




/usr/hdp/current/kafka-broker/bin/kafka-console-producer.sh --broker-list hadoop1:6667  --topic flink_checkpoint_test

/usr/hdp/current/kafka-broker/bin/kafka-console-consumer.sh --bootstrap-server hadoop1:6667 --topic flink_keyed_value_state_test --from-beginning
