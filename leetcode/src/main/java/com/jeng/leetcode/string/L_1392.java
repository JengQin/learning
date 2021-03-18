package com.jeng.leetcode.string;

/**
 * 1392.最长快乐前缀
 *
 */
public class L_1392 {
    public String longestPrefix(String s) {
        if (null == s || s.length() == 0) {
            return "";
        }
        int[] next = new int[s.length()+1];
        next[0] = -1;
        next[1] = 0;
        int k;
        for (int i = 2; i <= s.length(); i++) {
            k = next[i - 1];
            while (k != -1) {
                if (s.charAt(i - 1) == s.charAt(k)) {
                    next[i] = k + 1;
                    break;
                } else {
                    k = next[k];
                }
            }
            if (-1 == k) {
                next[i] = 0;
            }
        }

        if (next[next.length - 1] > 0) {
            return s.substring(0, next[next.length - 1]);
        } else {
            return "";
        }
        String s = "{\"pageNo\":1,\"pageSize\":100000,\"productId\":\"ttvoice\",\"userGroupId\":342}";
    }

    curl -X POST "http://10.10.74.153/datacenter-openads/openApi/userGroup/getUserGroupInfo" -H  "Request-Origion:SwaggerBootstrapUi" -H  "accept:*/*" -H  "Content-Type:application/json" -d ""
}
