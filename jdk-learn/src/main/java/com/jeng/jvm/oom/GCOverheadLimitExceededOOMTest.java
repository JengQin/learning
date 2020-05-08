package com.jeng.jvm.oom;

import java.util.ArrayList;
import java.util.List;

public class GCOverheadLimitExceededOOMTest {

    public static void main(String[] args) {

        /*
        -Xms10M -Xmx10M -XX:+PrintGCDetails -XX:MaxDirectMemorySize=10M
         */
        int i = 0;
        List<String> list = new ArrayList<>();

        try {
            while (true) {
                list.add(String.valueOf(++i).intern());
            }
        } catch (Exception e) {
            System.out.println("================== i: " + i);
            e.printStackTrace();
            throw e;
        }
    }
}
