package com.jeng.jdk.collection.hashmap;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        test();
    }


    public static void test(){
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Float> bMap = new HashMap<>();
        bMap.put(3,191.16f);
        bMap.put(4,63.72f);
        bMap.put(5,31.86f);
        bMap.put(6,19.116f);
        bMap.put(7,12.744f);
        bMap.put(8,9.103f);
        bMap.put(9,7.646f);
        bMap.put(10,7.08f);
        bMap.put(11,7.08f);
        bMap.put(12,7.646f);
        bMap.put(13,9.103f);
        bMap.put(14,12.744f);
        bMap.put(15,19.116f);
        bMap.put(16,31.86f);
        bMap.put(17,63.72f);
        bMap.put(18,191.16f);
        int[] num = {1,2,3,4,5,6};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                for (int k = 0; k < num.length; k++) {
                    int a = num[i];
                    int b = num[j];
                    int c = num[k];
                    int sum = a + b + c;
                    if (!countMap.containsKey(sum)) {
                        countMap.put(sum, 0);
                    }
                    countMap.put(sum, countMap.get(sum) + 1);
                    count++;
                }
            }
        }

        int totalCount = 0;
        float asum = 0;
        for (Integer sum : countMap.keySet()) {
            Integer value = countMap.get(sum);
            float f = (float)value/count*bMap.get(sum);
            System.out.println(String.format("和值: %d, 次数: %d, 概率：%f", sum, value, f));
            totalCount += value;
            asum += f;
        }

        System.out.println(String.format("count=%d, totalCount=%d, asum=%f", count, totalCount, asum));

    }
}
