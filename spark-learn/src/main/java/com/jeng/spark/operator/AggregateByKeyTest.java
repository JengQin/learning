package com.jeng.spark.operator;

import com.jeng.spark.SparkSessionBuilder;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.List;

public class AggregateByKeyTest {
    public static void main(String[] args) {
        JavaSparkContext javaSparkContext = SparkSessionBuilder.getJavaSparkContext();
        List<String> list = new ArrayList<String>();
        list.add("Java,100,u01");
        list.add("Java,99,u02");
        list.add("Java,90,u03");
        list.add("Spark,100,u03");
        list.add("Spark,90,u01");
        list.add("Spark,98,u02");
        JavaRDD<String> inputRDD = javaSparkContext.parallelize(list, 3);
        JavaPairRDD<String, Score> scoreRDD = inputRDD.mapToPair(new PairFunction<String, String, Score>() {

            public Tuple2<String, Score> call(String s) throws Exception {
                String[] split = s.split(",");
                return new Tuple2<String, Score>(split[2], new Score(split[0], split[2], Integer.valueOf(split[1])));
            }
        });

        Function2<Tuple2<Integer, Integer>, Score, Tuple2<Integer, Integer>> reduceFunc = new Function2<Tuple2<Integer, Integer>, Score, Tuple2<Integer, Integer>>() {
            public Tuple2<Integer, Integer> call(Tuple2<Integer, Integer> v1, Score v2) throws Exception {
                return new Tuple2<Integer, Integer>(v1._1 + v2.getScore(), v1._2 + 1);
            }
        };
        Function2<Tuple2<Integer, Integer>, Tuple2<Integer, Integer>, Tuple2<Integer, Integer>> comFunc = new Function2<Tuple2<Integer, Integer>, Tuple2<Integer, Integer>, Tuple2<Integer, Integer>>() {
            public Tuple2<Integer, Integer> call(Tuple2<Integer, Integer> v1, Tuple2<Integer, Integer> v2) throws Exception {
                return new Tuple2<Integer, Integer>(v1._1 + v2._1, v1._2 + v2._2);
            }
        };
        JavaPairRDD<String, Tuple2<Integer, Integer>> reducedRDD = scoreRDD.aggregateByKey(new Tuple2<Integer, Integer>(0, 0), reduceFunc, comFunc);
//        reducedRDD.foreach(new VoidFunction<Tuple2<String, Tuple2<Integer, Integer>>>() {
//            public void call(Tuple2<String, Tuple2<Integer, Integer>> kv) throws Exception {
//                System.out.println(kv._1 + ", score: " + kv._2._1 + ", count: " + kv._2._2);
//            }
//        });
    }

    static class Score {
        private String course;
        private String uId;
        private int score;

        public Score(String course, String uId, int score) {
            this.course = course;
            this.uId = uId;
            this.score = score;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public String getuId() {
            return uId;
        }

        public void setuId(String uId) {
            this.uId = uId;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }
}
