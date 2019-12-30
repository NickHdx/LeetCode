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
        System.out.println(obj.isPalindrome(12321));
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

//    public boolean isPalindrome(int x) {
//        if (x < 0 || (x % 10 == 0 && x != 0)) {
//            return false;
//        }
//        int y = 0;
//        while (x > y) {
//            y = y * 10 + x % 10;
//            x = x / 10;
//        }
//        return x == y || x == y / 10;
//    }
}
