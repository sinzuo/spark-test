Sbt 编译
$sbt compile #编译，等待很久，天朝龟速 
$sbt package #打包


./bin/spark-submit --supervise --class org.apache.spark.examples.streaming.KafkaWordCount  --master spark://spark:7077  --executor-memory 1G   --driver-memory 1G  --total-executor-cores 1 --executor-cores 1  --deploy-mode cluster  /tmp/simple-project_2.11-1.0.jar zookeeper:2181 2 2 2

生成 消息
kafka-console-producer.sh --broker-list kafka:9092 --topic syslog

查看 消息
kafka-console-consumer.sh --bootstrap-server spark:9092 --topic result  --from-beginning 

