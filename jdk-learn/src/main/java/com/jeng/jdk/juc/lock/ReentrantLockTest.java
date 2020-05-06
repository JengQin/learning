package com.jeng.jdk.juc.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource{
    int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void print(int num, int loop) {
        lock.lock();
        try {
            // 判断
            if (num==1){
                while (number != 1){
                    c1.await();
                }
            } else if (num == 2) {
                while (number != 2) {
                    c2.await();
                }
            } else if (num == 3) {
                while (number != 3) {
                    c3.await();
                }
            }
            // 干活
            for (int i = 1; i <= loop; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
            // 通知
            if (num==1){
                number=2;
                c2.signal();
            } else if (num == 2) {
                number=3;
                c3.signal();
            } else if (num == 3) {
                number=1;
                c1.signal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
public class ReentrantLockTest {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.print(1,3);
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.print(2,5);
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.print(3,10);
            }
        }, "C").start();
    }
}
