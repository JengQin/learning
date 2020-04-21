package com.jeng.spark.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

object TestStreaming {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Streaming-Test").setMaster("local[2]")
    val ssc = new StreamingContext(conf, Seconds(5))
    ssc.sparkContext.setLogLevel("ERROR")

    val dataStream = ssc.socketTextStream("localhost", MakeData.PORT)

    //    val mapedStream = dataStream.map(_.split(" ")).map(arr => {
    //      Thread.sleep(20000)
    //      (arr(0),arr(1))
    //    })
    val mapedStream = dataStream.map(line => {
      println("map")
      line.split(" ")
    })
      .transform(rdd => {
        println("transform")
        Thread.sleep(1000)
        rdd.map(arr => {
          (arr(0), arr(1))
        })
        rdd
      })

    mapedStream.foreachRDD(rdd => {
      println("foreachRDD")
      val count = rdd.count()
      println(count)
    }
    )

    ssc.start()

    ssc.awaitTermination()
  }

}
