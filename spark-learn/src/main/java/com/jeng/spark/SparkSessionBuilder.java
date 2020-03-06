package com.jeng.spark;

import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public class SparkSessionBuilder {

    public static SparkSession getSparkSession(){
        SparkSession sparkSession = SparkSession.builder()
                .appName("test")
                .master("local[*]")
                .config("HADOOP_HOME", "E:\\repository\\source_code\\hadoop")
                .getOrCreate();
        return sparkSession;
    }

    public static JavaSparkContext getJavaSparkContext(){
        SparkSession sparkSession = getSparkSession();
        final SparkContext sparkContext = sparkSession.sparkContext();
        return new JavaSparkContext(sparkContext);
    }
}
