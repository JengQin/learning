package com.jeng.educative.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProblemChallenge2 {
    public static List<Integer> findStringAnagrams(String str, String pattern) {
        List<Integer> result = new ArrayList<>();

        int windowStart = 0;
        int windowEnd = 0;
        int matched = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        // 遍历pattern,计算每个字符的frequency
        for (char c : pattern.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // 使用滑动窗口遍历str,匹配str中满足条件的anagrams
        for (windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            // 字符进入滑动窗口，改变滑动窗口的状态
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (0 == charFrequencyMap.get(rightChar)) {
                    matched++;
                }

                // 当前滑动窗口内的字符是pattern的anagram
                if (matched == charFrequencyMap.size()) {
                    result.add(windowStart);
                }
            }


            // 字符移出滑动窗口，判断移出的字符是那种类型，改变当前滑动窗口的状态
            if (windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0) {
                        matched--;
                    }
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }


        return result;
    }


    public static void main(String[] args) {
        System.out.println("Permutation exist: " + ProblemChallenge2.findStringAnagrams("oidbcabf", "abc"));
        System.out.println("Permutation exist: " + ProblemChallenge2.findStringAnagrams("odicf", "dc"));
        System.out.println("Permutation exist: " + ProblemChallenge2.findStringAnagrams("bcdxabcdy", "bcdyabcdx"));
        System.out.println("Permutation exist: " + ProblemChallenge2.findStringAnagrams("aaacb", "abc"));
    }
}
