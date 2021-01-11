package com.jeng.algorithm;

public class KMP {

    public static int[] getNextArray(char[] t) {
        int[] next = new int[t.length];
        next[0] = -1;
        next[1] = 0;
        int k;
        for (int j = 2; j < t.length; j++) {
            k = next[j - 1];// 数据当前最后一个元素
            while (k != -1) {
                if (t[j - 1] == t[k]) { // 字符串当前元素于第k元素相同，下一个字符的下标为k+1
                    next[j] = k + 1;
                    break;
                } else {
                    k = next[k];
                }
                next[j] = 0; // 字符串当前元素为第一次出现
            }
        }
        return next;
    }



    public static void main(String[] args) {
        char[] chars = "acaacab".toCharArray();
        int[] nextArray = getNextArray(chars);

        for (char aChar : chars) {
            System.out.print(aChar+",");
        }
        System.out.println();
        for (int i : nextArray) {
            System.out.print(i+",");
        }
    }
}
