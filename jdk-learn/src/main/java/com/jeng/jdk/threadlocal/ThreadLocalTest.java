package com.jeng.jdk.threadlocal;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {
    private static String key = "data_key";


    public static void main(String[] args) {

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(3,10,3000, TimeUnit.MINUTES,new LinkedBlockingQueue<>(100));


        Invoker invoker = new Invoker();
        threadPool.submit(() -> {
            String productId = "ttvoice";
            ThreadLocalCache.threadLocalBase.set(productId);
            System.out.println(Thread.currentThread().getName()+" =|=> "+productId);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String exec = invoker.exec();

            ThreadLocalCache.threadLocalBase.remove();
        });



        threadPool.submit(() -> {
            String productId = "yinpai";
            ThreadLocalCache.threadLocalBase.set(productId);
            System.out.println(Thread.currentThread().getName()+" =|=> "+productId);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String exec = invoker.exec();

            ThreadLocalCache.threadLocalBase.remove();
        });



        threadPool.submit(() -> {
            String productId = "shengdong";
            ThreadLocalCache.threadLocalBase.set(productId);
            System.out.println(Thread.currentThread().getName()+" =|=> "+productId);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String exec = invoker.exec();

            ThreadLocalCache.threadLocalBase.remove();
        });



        threadPool.shutdown();

        System.out.println("exit");
    }




    private static class Invoker{
        public String exec() {

            String productId = ThreadLocalCache.threadLocalBase.get();
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName()+" ==> "+productId);
            return productId;
        }
    }
}
