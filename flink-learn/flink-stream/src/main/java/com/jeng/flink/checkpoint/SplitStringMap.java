package com.jeng.flink.checkpoint;

import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;

/**
 * The SplitStringMap
 *
 * @author JiaZheng
 * @create 2019-09-16 22:21
 */
public class SplitStringMap extends RichMapFunction<String, Tuple2<String,Long>> {

    @Override
    public Tuple2 map(String in) throws Exception {
        String[] split = in.split(",");
        if (split.length >= 2) {
            return new Tuple2(split[0], Long.valueOf(split[1]));
        }else{
            return new Tuple2("null", 1L);
        }
    }

}
