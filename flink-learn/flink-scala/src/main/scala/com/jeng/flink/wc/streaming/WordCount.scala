package com.jeng.flink.wc.streaming

import org.apache.flink.streaming.api.scala._

object WordCount {

  def main(args: Array[String]): Unit = {

    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val inputDataStream = env.socketTextStream("localhost", 7777)
    val resultDataStream = inputDataStream.flatMap(_.split(" "))
      .filter(_.nonEmpty)
      .map((_, 1))
      .keyBy(0)
        .sum(1).setParallelism(2)

    resultDataStream.print().setParallelism(1)

    env.execute("stream word count job")
  }
}
