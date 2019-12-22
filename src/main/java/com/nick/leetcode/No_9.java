package com.nick.leetcode;

// https://leetcode.com/problems/palindrome-number/
public class No_9 {
    public static void main(String[] args) {
        No_9 obj = new No_9();
        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.isPalindrome(-121));
        System.out.println(obj.isPalindrome(10));
        System.out.println(obj.isPalindrome(0));
        System.out.println(obj.isPalindrome(Integer.MAX_VALUE));
        System.out.println(obj.isPalindrome(1001));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        long y = 0;
        while (temp > 0) {
            y = y * 10 + temp % 10;
            temp = temp / 10;
        }
        return x == y;
    }
}
