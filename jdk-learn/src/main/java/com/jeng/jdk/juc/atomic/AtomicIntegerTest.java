package com.jeng.jdk.juc.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The AtomicIntegerTest
 *
 * @author JiaZheng
 * @create 2020-05-04 10:28
 */
public class AtomicIntegerTest {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomic = new AtomicInteger(0);

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 5000; j++) {
                    atomic.getAndIncrement();
                }
                System.out.println("Finish "+Thread.currentThread().getName());
            },"T"+i);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        while (Thread.activeCount() > 2){
            Thread.currentThread().join(100); //如果活跃线程数大于2（main线程和GC线程）就挂起
        }
        System.out.println(atomic.get());
    }
}
