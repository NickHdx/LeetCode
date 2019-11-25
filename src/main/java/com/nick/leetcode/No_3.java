package com.nick.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// String
public class No_3 {
    public static void main(String[] args) {
        No_3 obj = new No_3();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s));
        s = "bbbbb";
        System.out.println(obj.lengthOfLongestSubstring(s));
        s = "pwwkew";
        System.out.println(obj.lengthOfLongestSubstring(s));
        s = "aab";
        System.out.println(obj.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() <= 0) return 0;
        List<Character> list = new ArrayList<>();
        int max = 0;
        char[] chars = s.toCharArray();
        int i = 0;
        int len = chars.length;
        while (i < len) {
            if (list.contains(chars[i])) {
                list.remove(0);
                continue;
            }
            list.add(chars[i]);
            if (list.size() > max) {
                max = list.size();
            }
            i++;
        }
        return max;
    }
}
