package com.jeng.jvm.gc;

import sun.nio.ch.DirectBuffer;

import java.nio.ByteBuffer;

/**
 * The PrintGCDetailsTest
 *
 * @author JiaZheng
 * @create 2020-05-07 20:39
 */
public class PrintGCDetailsTest {

    public static void main(String[] args) {
        /*
        -Xms10M -Xmx10M -XX:+PrintGCDetails
         */
        System.out.println("Print GC Detail info");
        byte[] bytes = new byte[20 * 1024 * 1024];
        ByteBuffer buffer = ByteBuffer.allocateDirect(100);
    }
}
