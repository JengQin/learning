package com.jeng.flink.window;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.windowing.ProcessWindowFunction;
import org.apache.flink.streaming.api.windowing.assigners.TumblingProcessingTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.util.Collector;

import java.util.StringJoiner;

public class SocketWindowWordCount {

    public static void main(String[] args) {

        String hostName="localhost";
        int port = 9999;

        /*创建env*/
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        /*创建connector，读取数据*/
        DataStreamSource<String> text = env.socketTextStream(hostName, port, "\n");

        /*数据转换*/
        SingleOutputStreamOperator<String> wordStream = text.flatMap(new RichFlatMapFunction<String, String>() {
            public void flatMap(String line, Collector<String> collector) throws Exception {
                for (String word : line.split("\\s")) {
                    collector.collect(word);
                }
            }
        }).setParallelism(1);

        SingleOutputStreamOperator<WordKey> wordKeyStream = wordStream.map(new MapFunction<String, WordKey>() {
            @Override
            public WordKey map(String s) throws Exception {
                int key = s.hashCode() % 2;

                return new WordKey(s, key >= 0 ? key : key * -1);
            }
        }).setParallelism(1);

        SingleOutputStreamOperator<String> wordCount = wordKeyStream.keyBy(WordKey::getKey)
                .window(TumblingProcessingTimeWindows.of(Time.seconds(20)))
                .trigger(new CustomTrigger(3))
                .process(new ProcessWindowFunction<WordKey, String, Long, TimeWindow>() {
                    @Override
                    public void process(Long key, Context context, Iterable<WordKey> elements, Collector<String> out) throws Exception {
                        TimeWindow window = context.window();
                        long start = window.getStart();
                        long end = window.getEnd();
                        int count = 0;
                        for (WordKey wordKey : elements) {
                            count++;
                            System.out.println(String.format("key=%d, word=%s, start=%s, end=%s", key, wordKey.toString(),
                                    DateFormatUtils.format(start, "yyyy-MM-dd HH:mm:ss"),
                                    DateFormatUtils.format(end, "yyyy-MM-dd HH:mm:ss")));;
                        }

                        out.collect(String.format("key=%d, count=%d, start=%s, end=%s",  key,count,DateFormatUtils.format(start,"yyyy-MM-dd HH:mm:ss"),
                                DateFormatUtils.format(end,"yyyy-MM-dd HH:mm:ss")));
                    }
                }).setParallelism(1);

        wordCount.print();
        try {
            JobExecutionResult executionResult = env.execute("Socket Window WordCount");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }




    public static class WordKey {
        private String word;
        private long key;

        public WordKey() {

        }

        public WordKey(String word, long key) {
            this.word = word;
            this.key = key;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public long getKey() {
            return key;
        }

        public void setKey(long key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return word + ":" + key;
        }
    }
}
