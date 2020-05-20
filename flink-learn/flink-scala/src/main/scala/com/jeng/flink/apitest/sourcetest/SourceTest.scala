package com.jeng.flink.apitest.sourcetest

import org.apache.flink.streaming.api.scala._


case class SensorReading(id: String, timestamp: Long, num: Double)

object SourceTest {

  def main(args: Array[String]): Unit = {
    // 创建执行环境
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    env.setParallelism(2)

    // 读取数据
    val inpuDataStream = env.fromCollection(List(
      SensorReading("sensor_1", 154771899, 35.6),
      SensorReading("sensor_2", 154771899, 65.6),
      SensorReading("sensor_4", 154771899, 32.6),
      SensorReading("sensor_5", 154771899, 43.6),
      SensorReading("sensor_9", 154771899, 23.6),
      SensorReading("sensor_6", 154771899, 25.6),
      SensorReading("sensor_8", 154771899, 76.6),
      SensorReading("sensor_7", 154771899, 86.6)
    ))
    inpuDataStream.print()
    env.execute("SourceTest")
  }
}
