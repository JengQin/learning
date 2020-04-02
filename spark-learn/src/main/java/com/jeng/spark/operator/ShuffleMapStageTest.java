package com.jeng.spark.operator;

import com.jeng.spark.SparkSessionBuilder;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.util.SizeEstimator;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShuffleMapStageTest {

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
        JavaPairRDD<String, Integer> pairRDD = inputRDD.mapToPair(new PairFunction<String, String, Integer>() {
            public Tuple2<String, Integer> call(String s) throws Exception {
                return new Tuple2<String, Integer>(s.split(",")[2], Integer.valueOf(s.split(",")[1]));
            }
        });
        JavaPairRDD<String, Integer> reduceByKey = pairRDD.reduceByKey(new Function2<Integer, Integer, Integer>() {
            public Integer call(Integer v1, Integer v2) throws Exception {
                return v1+v2;
            }
        },3);

        JavaPairRDD<String, Integer> falRDD = reduceByKey.aggregateByKey(0,3,new Function2<Integer, Integer, Integer>() {
            public Integer call(Integer v1, Integer v2) throws Exception {
                return v1 + v2;
            }
        }, new Function2<Integer, Integer, Integer>() {
            public Integer call(Integer v1, Integer v2) throws Exception {
                return v1 + v2;
            }
        });

        falRDD.foreach(new VoidFunction<Tuple2<String, Integer>>() {
            public void call(Tuple2<String, Integer> v) throws Exception {
                System.out.println(v._1+": "+v._2);
            }
        });
    }
}
