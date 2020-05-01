package com.jeng.jdk.juc.volatile_;

/**
 * volatile可见性测试
 */

class MyData {
    volatile private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber60() {
        this.number = 60;
    }
}
public class VisibilityTest {


    public static void main(String[] args) {
        MyData myData = new MyData();
        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + ": number=" + myData.getNumber());
                Thread.sleep(3000);
                myData.setNumber60();
                System.out.println(Thread.currentThread().getName() + ": after 3s, number=" + myData.getNumber());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AA").start();

        while (myData.getNumber() == 0) {
            // loop
        }
        System.out.println(Thread.currentThread().getName() + ": number=" + myData.getNumber());
    }
}


