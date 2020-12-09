package com.jeng.jdk.juc.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The ConcurrentHashMapTest
 *
 * @author JiaZheng
 * @create 2020-09-16 21:26
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        Map<String, String> hashMap = new HashMap<>();
    }
}
