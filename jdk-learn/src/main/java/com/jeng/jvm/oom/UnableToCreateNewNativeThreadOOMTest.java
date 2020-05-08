package com.jeng.jvm.oom;

import java.util.concurrent.TimeUnit;

public class UnableToCreateNewNativeThreadOOMTest {

    public static void main(String[] args) {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    System.out.println("starting thread: "+ finalI);
                    TimeUnit.SECONDS.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
