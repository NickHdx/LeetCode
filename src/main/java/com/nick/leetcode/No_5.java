package com.nick.leetcode;
// Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/
public class No_5 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(new No_5().longestPalindrome(s));
        s = "cbbd";
        System.out.println(new No_5().longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] chars = s.toCharArray();
        int maxBegin = 0;
        int maxEnd = 0;
        int len = chars.length;
        boolean isPalindromic;
        for (int begin = 0; begin < len; begin++){
            for (int end = 0; end < len; end++) {
                isPalindromic = true;
                for (int i = 0; (begin + i) <= (begin + end) / 2; i++) {
                    if (chars[begin + i] != chars[end - i]) {
                        isPalindromic = false;
                        break;
                    }
                }
                if (isPalindromic && (end - begin + 1) > (maxEnd - maxBegin + 1)) {
                    maxEnd = end;
                    maxBegin = begin;
                }
            }
        }
        return s.substring(maxBegin, maxEnd + 1);
    }
}
