package com.jeng.spark.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

object TestStreaming {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Streaming-Test").setMaster("local[2]")
    val ssc = new StreamingContext(conf,Seconds(5))
    ssc.sparkContext.setLogLevel("ERROR")

    val dataStream = ssc.socketTextStream("localhost",8089)

    val mapedStream = dataStream.map(_.split(" ")).map(arr => {
      Thread.sleep(20000)
      (arr(0),arr(1))
    })
    mapedStream.print()

    ssc.start()

    ssc.awaitTermination()
  }

}
