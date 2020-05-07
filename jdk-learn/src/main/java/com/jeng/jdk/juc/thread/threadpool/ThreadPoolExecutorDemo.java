package com.jeng.jdk.juc.thread.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(
                2
                ,Runtime.getRuntime().availableProcessors() + 1
                ,2L
                , TimeUnit.SECONDS
                , new LinkedBlockingQueue<>(3)
                , Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.CallerRunsPolicy());

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(4);
        ExecutorService workStealingPool = Executors.newWorkStealingPool();
        try {
            BlockingQueue<Future<String>> futures = new LinkedBlockingQueue<>();
            for (int i = 0; i < 10; i++) {
                int num = i;
                Future<String> future = threadPool.submit(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t执行任务：" + num);
                    return "Finish task " + num;
                });
                futures.offer(future);
            }

            TimeUnit.SECONDS.sleep(2L);
            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
