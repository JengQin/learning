package com.jeng.educative.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProblemChallenge1 {
    public static boolean existsPermutation(String str, String pattern) {
        // 将pattern的字符保存到hashmap
        // 遍历字符串，依次将字符加入滑动窗口
        // 每加入一个字符，判断是否匹配hashmap的字符，如果匹配则字符频率就-1,当字符的频率为0时匹配match+1
        // 如果匹配match等于hashmap个数时，则匹配成功(不能使用match==pattern.length来判断，因为滑动窗口内的字符有可能都是相同的字符，如都是“a”或都是“b”这种情况)
        // 当滑动窗口大于pattern时，就从滑动窗口移出字符，如果字符匹配hashmap，字符频率+1，如果原来字符频率已经为0，则在给字符频率加1之前，匹配match先-1

        int windowStart = 0;
        int matched = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char chr : pattern.toCharArray()){
            charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0) + 1);
        }

        //滑动窗口
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (0 == charFrequencyMap.get(rightChar)) { // 有一个字符的频率降到0，说明该字符的个数已经匹配上了
                    matched++;
                }
            }

            // 判断是否匹配pattern
            if (matched == charFrequencyMap.size()) {
                return true;
            }

            if (windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart++);//移动滑动窗口
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0) {//如果原来字符频率已经为0，则在给字符频率加1之前，匹配match先-1
                        matched--;
                    }
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Permutation exist: " + ProblemChallenge1.existsPermutation("oidbcaf", "abc"));
        System.out.println("Permutation exist: " + ProblemChallenge1.existsPermutation("odicf", "dc"));
        System.out.println("Permutation exist: " + ProblemChallenge1.existsPermutation("bcdxabcdy", "bcdyabcdx"));
        System.out.println("Permutation exist: " + ProblemChallenge1.existsPermutation("aaacb", "abc"));


        System.out.println("===========");
        List<String> permutation = ProblemChallenge1.findPermutation("asdfbasdfbfasdf", "ads");
        for (String str : permutation) {
            System.out.println(str);
        }
    }

    public static List<String> findPermutation(String str, String pattern) {
        // 将pattern的字符保存到hashmap
        // 遍历字符串，依次将字符加入滑动窗口
        // 每加入一个字符，判断是否匹配hashmap的字符，如果匹配则字符频率就-1,当字符的频率为0时匹配match+1
        // 如果匹配match等于hashmap个数时，则匹配成功(不能使用match==pattern.length来判断，因为滑动窗口内的字符有可能都是相同的字符，如都是“a”或都是“b”这种情况)
        // 当滑动窗口大于pattern时，就从滑动窗口移出字符，如果字符匹配hashmap，字符频率+1，如果原来字符频率已经为0，则在给字符频率加1之前，匹配match先-1

        List<String> permutations = new ArrayList<>();
        int windowStart = 0;
        int matched = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char chr : pattern.toCharArray()){
            charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0) + 1);
        }

        //滑动窗口
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (0 == charFrequencyMap.get(rightChar)) { // 有一个字符的频率降到0，说明该字符的个数已经匹配上了
                    matched++;
                }
            }

            // 判断是否匹配pattern
            if (matched == charFrequencyMap.size()) {//匹配上，就将滑动窗口的内容输出
                permutations.add(str.substring(windowStart, windowEnd + 1));
            }

            if (windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart++);//移动滑动窗口
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0) {//如果原来字符频率已经为0，则在给字符频率加1之前，匹配match先-1
                        matched--;
                    }
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }
        return permutations;
    }
}
