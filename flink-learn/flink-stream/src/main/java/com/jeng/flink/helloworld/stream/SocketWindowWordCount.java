package com.jeng.flink.helloworld.stream;

import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.common.accumulators.IntCounter;
import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.core.fs.FileSystem;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class SocketWindowWordCount {

    public static void main(String[] args) {
        ParameterTool params = ParameterTool.fromArgs(args);

        String hostName="";
        int port = 0;
        try {
            hostName = params.get("host","localhost");
            port = params.getInt("port",9999);
        } catch (Exception e) {
            System.err.println("No port specified. Please run 'SocketWindowWordCount " +
                    "--host <hostname> --port <port>', where hostname (localhost by default) " +
                    "and port is the address of the text server");
            System.err.println("To start a simple text server, run 'netcat -l <port>' and " +
                    "type the input text into the command line");
        }
        /*创建env*/
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        /*创建connector，读取数据*/
        DataStreamSource<String> text = env.socketTextStream(hostName, port, "\n");
        /*数据转换*/
        SingleOutputStreamOperator<WordCount> wordStream = text.flatMap(new RichFlatMapFunction<String, WordCount>() {
            private IntCounter intCounter = new IntCounter();
            @Override
            public void open(Configuration parameters) throws Exception {
                getRuntimeContext().addAccumulator("line-count",intCounter);
                super.open(parameters);
            }

            @Override
            public void close() throws Exception {
                super.close();
            }

            public void flatMap(String line, Collector<WordCount> collector) throws Exception {
                intCounter.add(1);
                for (String word : line.split("\\s")) {
                    collector.collect(new WordCount(word, 1L));
                }
            }
        });
        SingleOutputStreamOperator<WordCount> wordCount = wordStream.keyBy("word")
//                .timeWindow(Time.seconds(5))
                .reduce(new ReduceFunction<WordCount>() {
                    public WordCount reduce(WordCount a, WordCount b) throws Exception {
                        return new WordCount(a.word, a.count + b.count);
                    }
                });
        wordCount.print();
        wordCount.writeAsText("output", FileSystem.WriteMode.OVERWRITE);
        try {
            JobExecutionResult executionResult = env.execute("Socket Window WordCount");
            Object lineCount = executionResult.getAccumulatorResult("line-count");
            System.out.println(lineCount);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static class WordCount{
        private String word;
        private long count;

        public WordCount() {

        }

        public WordCount(String word, long count) {
            this.word = word;
            this.count = count;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public long getCount() {
            return count;
        }

        public void setCount(long count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return word + ":" + count;
        }
    }
}
