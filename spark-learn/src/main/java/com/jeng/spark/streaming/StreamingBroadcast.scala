package com.jeng.spark.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Duration, StreamingContext}

object StreamingBroadcast {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[3]").setAppName("StreamingBroadcastTest")
    val ssc = new StreamingContext(conf,Duration(1000))

    val sc = ssc.sparkContext
    sc.setLogLevel("ERROR")

    val broadcast = sc.broadcast((1 to 5).toList)

    val inputDataStream = ssc.socketTextStream("localhost",MakeData.PORT)

    val format = inputDataStream.map(_.split(" ")).map(arr => (arr(0),arr(1).toInt))
    val filterDataStream = format.transform(rdd => {
      val newRDD = rdd.filter(x => {
        val bool = broadcast.value.contains(x._2)
        println(bool)
        bool
      })
      newRDD
    })
    filterDataStream.print()

    ssc.start()
    ssc.awaitTermination()

  }
}
