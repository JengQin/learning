package com.jeng.spark.operator;

import com.jeng.spark.SparkSessionBuilder;
import org.apache.spark.HashPartitioner;
import org.apache.spark.Partitioner;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.util.SizeEstimator;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MapPartitionsWithIndex {

    public static void main(String[] args) throws InterruptedException {
        final List<String> list = new ArrayList<String>();
        list.add("Java,100,u01");
        list.add("Java,95,u02");
        list.add("Java,90,u03");
        list.add("Spark,100,u03");
        list.add("Spark,90,u01");
        list.add("Spark,98,u02");
        JavaSparkContext javaSparkContext = SparkSessionBuilder.getJavaSparkContext();
        JavaRDD<String> inputRDD = javaSparkContext.parallelize(list, 3);
        JavaPairRDD<String, String> pairRDD = inputRDD.mapToPair(new PairFunction<String, String, String>() {
            public Tuple2<String, String> call(String s) throws Exception {
                return new Tuple2<String, String>(s.split(",")[2], s);
            }
        });
        JavaPairRDD<String, Iterable<String>> groupRDD = pairRDD.groupByKey(3);
        JavaRDD<String> rdd2 =  groupRDD.mapPartitionsWithIndex(new Function2<Integer, Iterator<Tuple2<String, Iterable<String>>>, Iterator<String>>() {
            public Iterator<String> call(Integer index, Iterator<Tuple2<String, Iterable<String>>> v2) throws Exception {
                List<String> list1 = new LinkedList<String>();
                while (v2.hasNext()) {
                    Tuple2<String, Iterable<String>> next = v2.next();
                    Iterator<String> iterator = next._2.iterator();
                    while (iterator.hasNext()) {
                        String line = iterator.next();
                        System.out.println("分区"+index+":"+ line);
                        list1.add(line);
                    }
                }
                return list1.iterator();
            }
        }, true);

        long count = rdd2.count();
//        Thread.sleep(10000000L);
        long estimate = SizeEstimator.estimate(rdd2);
        System.out.println(estimate);
        System.out.println(count);
    }
}
