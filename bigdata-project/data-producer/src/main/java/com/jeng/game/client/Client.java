package com.jeng.game.client;

import com.jeng.game.client.data.MessageProducer;
import com.jeng.game.client.data.MessageSender;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * The Client
 *
 * @author JiaZheng
 * @create 2020-05-17 17:04
 */
public class Client {
    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);
    private ThreadPoolExecutor threadPool;

    public Client() {
        threadPool = new ThreadPoolExecutor(2
                ,2
                ,2L
                ,TimeUnit.SECONDS
                ,new LinkedBlockingQueue<>(100)
                ,Executors.defaultThreadFactory()
                ,new ThreadPoolExecutor.CallerRunsPolicy() //如果队列满了，则使用调度者运行
        );
    }

    public static void main(String[] args) throws ParseException {
        // 创建 Options 对象
        Options options = new Options();
        options.addOption("h", "help", false, "Lists short help");
        options.addOption("t", "logType", true, "生成的log类型，默认是all,全部生成，可选:active,login,order,all");
        options.addOption("c", "count", true, "生成log的条数，默认是10条");
        options.addOption("i", "interval_time", true, "消息生产的间隔，单位是ms，默认是100ms");
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        if (help(cmd, options)){
            return;
        }
        Client client = new Client();
        client.process(cmd, options);
    }


    private void process(CommandLine cmd, Options options) {
        String logType="all";
        int count = 10;
        long interval = 100;
        if (cmd.hasOption("t")) {
            logType = cmd.getOptionValue("t");
        }
        if (cmd.hasOption("c")) {
            count = Integer.valueOf(cmd.getOptionValue("c"));
        }
        if (cmd.hasOption("i")) {
            interval = Integer.valueOf(cmd.getOptionValue("i"));
        }
        LOGGER.info("t=" + logType + ", c=" + count + ", i=" + interval);
        BlockingQueue<String> msgQueue = new LinkedBlockingQueue<>(1000);
        // 启动消息发送线程
        LOGGER.info("Starting message send thread....");
        MessageSender messageSender = new MessageSender(msgQueue);
        threadPool.execute(messageSender);

        // 启动消息生产线程
        LOGGER.info("Starting message produce thread....");
        MessageProducer producer = new MessageProducer(msgQueue, logType, count, interval);
        Future<Boolean> future = threadPool.submit(producer);

        try {
            //等待消息生产完成，然后判断send线程是否将所有的消息发送完成
            Boolean isTerminated = future.get();
            if (isTerminated){
                boolean flag = true;
                while (flag){
                    if (msgQueue.size() == 0) {// 消息已经发送完成
                        LOGGER.info("Closing Sender thread.");
                        messageSender.setTerminated(true);//关闭send线程
                        flag = false;
                    }
                    TimeUnit.SECONDS.sleep(5L);
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            messageSender.setTerminated(true);//关闭send线程
            e.printStackTrace();
        } finally {
            threadPool.shutdownNow();
        }

    }
    private static boolean help(CommandLine cmd,Options options) {
        HelpFormatter hf = new HelpFormatter();
        if (cmd.hasOption("h")) {
            // 这里显示简短的帮助信息
            hf.printHelp("client_main", options, true);
            // 打印opts的名称和值
            System.out.println("--------------------------------------");
            Option[] opts = cmd.getOptions();
            if (opts != null) {
                for (Option opt1 : opts) {
                    String name = opt1.getLongOpt();
                    String value = cmd.getOptionValue(name);
                    System.out.println(name + "=>" + value);
                }
            }
            return true;
        }
        return false;
    }
}
