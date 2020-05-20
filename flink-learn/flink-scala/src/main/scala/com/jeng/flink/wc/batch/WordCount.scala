package com.jeng.flink.wc.batch

import org.apache.flink.api.scala._

object WordCount {

  def main(args: Array[String]): Unit = {
    val env = ExecutionEnvironment.getExecutionEnvironment
    val input: DataSet[String] = env.readTextFile("D:\\software_develop\\workspace\\idea_workspace\\learning\\flink-learn\\flink-scala\\src\\main\\resources\\wordcount.txt")

    val resultDataSet = input.flatMap(e => {
      e.split(" ")
    }).map((_, 1))
        .groupBy(0)
        .sum(1)

    resultDataSet.print()
  }
}
