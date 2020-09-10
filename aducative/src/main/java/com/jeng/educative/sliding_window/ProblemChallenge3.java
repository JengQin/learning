package com.jeng.educative.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class ProblemChallenge3 {

    public static String findSubstring(String str, String pattern) {
        // 当条件满足时，滑动窗口中的字符就是所求满足条件的字符串
        // 满足条件：滑动窗口内的字符匹配刚好消耗完pattern的所有字符，此时滑动窗口内的字符串就是一个匹配pattern的实例（但不是最短长度的）
        // 滑动窗口移动的条件：
        //     右边：每次都向前滑动，滑动完之后进行状态判断
        //     左边：匹配字符数=pattern长度时
        //          如果当前滑动窗口匹配上了pattern的所有字符，则windowStart向前移动
        //              判断leftChar是否是pattern的字符
        //               如果是，则不移动
        //               如果不是，则移动多步，知道leftChar是pattern中的字符（且windowStart<=windowEnd）
        // 右边移动完之后，需要进行状态更新，左边移动后也需要进行状态更新

        int windowStart = 0;
        int matchedCount = 0;
        int minLength = str.length() + 1;
        int subStrStart = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // 右边移动窗口
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) >= 0) {
                    matchedCount++;
                }
            }

            // 当窗口中的字符已经匹配了pattern的所有字符matchedCount=pattern.length，从左边收缩窗口，知道matchedCount<pattern.length
            while (matchedCount == pattern.length()) {
                int currentWinLength = windowEnd - windowStart + 1;
                if (minLength > currentWinLength) {
                    minLength = currentWinLength;
                    subStrStart = windowStart;
                }
                // 从左边收缩窗口时，进行状态的更新
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0) {
                        matchedCount--;
                    }
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }
        return minLength > str.length() ? "" : str.substring(subStrStart, subStrStart + minLength);


    }

    public static void main(String[] args) {
        System.out.println(findSubstring("aabdec", "abc"));
        System.out.println(findSubstring("abdabca", "abc"));
        System.out.println(findSubstring("adcad", "abc"));
    }



}
