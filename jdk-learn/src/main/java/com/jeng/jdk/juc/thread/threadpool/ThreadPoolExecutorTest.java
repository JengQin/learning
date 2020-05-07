package com.jeng.jdk.juc.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * The ThreadPoolExecutorTest
 *
 * @author JiaZheng
 * @create 2020-05-06 21:39
 */
public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                Runtime.getRuntime().availableProcessors() + 1,
                2L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                new ThreadPoolExecutor.CallerRunsPolicy());

        try {
            for (int i = 0; i < 14; i++) {
                int num = i;
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t处理业务：" + num);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
