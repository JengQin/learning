import java.net.{URI, URL}

import org.apache.spark.SparkException
import org.apache.spark.rpc.RpcEndpointAddress
//
//class RpcEndpointAddress(host: String, port: Int) {
//  def hostPort: String = host + ":" + port
//
//  /** Returns a string in the form of "spark://host:port". */
//  def toSparkURL: String = "spark://" + hostPort
//
//  override def toString: String = hostPort
//}

object RpcEndpoint {

//  def apply(host: String, port: Int): RpcEndpointAddress = {
//    new RpcEndpointAddress(host, port)
//  }
//
//  def apply(sparkUrl: String): RpcEndpointAddress = {
//    try {
//      val uri = new java.net.URI(sparkUrl)
//      val host = uri.getHost
//      val port = uri.getPort
//      val name = uri.getUserInfo
//      if (uri.getScheme != "spark" ||
//        host == null ||
//        port < 0 ||
//        name == null ||
//        (uri.getPath != null && !uri.getPath.isEmpty) || // uri.getPath returns "" instead of null
//        uri.getFragment != null ||
//        uri.getQuery != null) {
//        throw new SparkException("Invalid Spark URL: " + sparkUrl)
//      }
//      new RpcEndpointAddress(host, port)
//    } catch {
//      case e: java.net.URISyntaxException =>
//        throw new SparkException("Invalid Spark URL: " + sparkUrl, e)
//    }
//  }

  def main(args: Array[String]): Unit = {
    val url1="spark://YarnScheduler@dc_hadoop_task2:42961"
    val uri1 = new URI((url1))
    val host1 = uri1.getHost
    val port1 = uri1.getPort
    val name1 = uri1.getUserInfo
    println("uri1.getPath:"+uri1.getPath)
    println("uri1.getPath.isEmpty:"+uri1.getPath.isEmpty)
    println("uri1.getFragment:"+uri1.getFragment)
    println("uri1.getQuery:"+uri1.getQuery)
    println("host1:"+host1+", port1:"+port1+", name1:"+name1)

    println("=----------------")
    val url2="spark://YarnScheduler@dc-hadoop-task2:42961"
    val uri2 = new URI((url2))
    val host2 = uri1.getHost
    val port2 = uri1.getPort
    val name2 = uri1.getUserInfo
    println("uri2.getPath:"+uri2.getPath)
    println("uri2.getPath.isEmpty:"+uri2.getPath.isEmpty)
    println("uri2.getFragment:"+uri2.getFragment)
    println("uri2.getQuery:"+uri2.getQuery)
    println("host2:"+host2+", port2:"+port2+", name2:"+name2)
  }
}
