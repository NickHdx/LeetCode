package com.nick.leetcode;

public class No_10 {
    public static void main(String[] args) {
        No_10 obj = new No_10();

    }

    public boolean isMatch(String s, String p) {
        int j = 0, i = 0, lastBegin = 0, lastEnd = 0;
        boolean isMatch = true;
        while (i < p.length() && j < s.length()) {
            if (i + 1 < p.length() && p.charAt(i + 1) == '*') {

            }

            if (p.charAt(i) != s.charAt(j)){
                isMatch = false;
                break;
            }
            lastBegin = j;
            lastEnd = j;
        }
        return isMatch;
    }
}
