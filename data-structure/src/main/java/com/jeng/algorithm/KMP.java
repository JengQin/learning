package com.jeng.algorithm;

public class KMP {

    public static int[] getNextArray(char[] t) {
        int[] next = new int[t.length+1];
        next[0] = -1;
        next[1] = 0;
        int k;
        for (int j = 2; j <= t.length; j++) {
            k = next[j - 1];// 前一个元素的最大公共前缀
            while (k != -1) {
                if (t[j - 1] == t[k]) { //
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

    public static int[] getNextArray2(char[] t) {
        int[] next = new int[t.length+1];
        next[0] = -1;
        next[1] = 0;
        int k;
        for (int j = 2; j <= t.length; j++) {
            k = next[j - 1];// 前一个元素的最大公共前缀字符个数
            while (k != -1) {
                if (t[j-1] == t[k]) { //
                    next[j] = k + 1;
                    break;
                } else {
                    k = next[k];    // 从前一个最大公共的前缀找出其最大前后缀（套娃）
                }
            }

            if (-1 == k) {
                next[j] = 0;
            }
        }
        return next;
    }



    public static void main(String[] args) {
        char[] chars = "acacadacacacd".toCharArray();
        int[] nextArray = getNextArray(chars);
        int[] nextArray2 = getNextArray2(chars);

        System.out.print("   ");
        for (char aChar : chars) {
            System.out.print(aChar+",");
        }
        System.out.println();
        for (int i : nextArray) {
            System.out.print(i+",");
        }

        System.out.println();
        for (int i : nextArray2) {
            System.out.print(i+",");
        }
    }
}
