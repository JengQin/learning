package com.jeng.jdk.juc.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * The AirConditioner
 *
 * @author JiaZheng
 * @create 2020-04-16 22:14
 */
public class AirConditioner {

    public static void main(String[] args) {
        Resource resource = new Resource();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    resource.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                try {
                    resource.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

    }

}

class Resource{

    private int number = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            if (number != 0) {
                this.wait();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            this.notifyAll();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException {
        lock.lock();
        if (0 == number) {
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        this.notifyAll();
        lock.unlock();
    }

}
