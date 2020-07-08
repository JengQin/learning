package com.jeng.jdk.string;

import java.awt.*;
import java.util.Random;
import java.util.StringTokenizer;

public class StringSplitTest {
    public static void main(String[] args) {
        String[] line = {
                "中国|0|广东省|0|电信",
                "中国|0|北京|北京市|0",
                "中国|0|云南省|昆明市|电信",
                "中国|0|湖北省|武汉市|电信"
        };

        Random random = new Random();
        int num=10;

        long start = System.nanoTime();
        for (int i = 0; i < num; i++) {
            String[] split = line[random.nextInt(4)].split("\\|");
            System.out.println(split[0]+","+split[1]+","+split[2]+","+split[3]+","+split[4]);
        }
        long end1 = System.nanoTime();

        System.out.println();
        System.out.println();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(line[random.nextInt(4)],"\\|");
            while (stringTokenizer.hasMoreElements()) {
                String ne = stringTokenizer.nextToken();
                stringBuilder.append(ne).append(",");
            }
            stringBuilder.append("\n");
        }
        long end2 = System.nanoTime();

        System.out.println(stringBuilder.toString());
        System.out.println("split: " + (end1 - start) / 1000_000 + ", token: " + (end2 - end1)/1000_000);
    }
}
