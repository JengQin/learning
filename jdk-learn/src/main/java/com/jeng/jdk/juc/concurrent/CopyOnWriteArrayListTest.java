package com.jeng.jdk.juc.concurrent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * The CopyOnWriteArrayListTest
 *
 * @author JiaZheng
 * @create 2020-05-04 11:33
 */
public class CopyOnWriteArrayListTest {


    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("");
    }
}
