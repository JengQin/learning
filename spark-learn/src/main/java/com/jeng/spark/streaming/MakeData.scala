package com.jeng.spark.streaming

import java.io.PrintStream
import java.net.ServerSocket

object MakeData {
  val PORT: Int = 8089
  def main(args: Array[String]): Unit = {

    val server = new ServerSocket(PORT)
    println("Server start")
    while(true) {
      val socket = server.accept()

      new Thread(){
        private var num = 0
        override def run(): Unit = {
          println("new client start")
          val outputStream = socket.getOutputStream
          val printer = new PrintStream(outputStream)
          while(socket.isConnected) {
            num+=1
            printer.println(s"hello $num")
            Thread.sleep(1000)
          }

        }
      }.start()
    }
  }
}
