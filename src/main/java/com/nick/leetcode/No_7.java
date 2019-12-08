package com.nick.leetcode;
// https://leetcode.com/problems/reverse-integer/
// arithmetic
public class No_7 {
    public static void main(String[] args) {
        No_7 obj = new No_7();
        System.out.println(obj.reverse(123));
        System.out.println(obj.reverse(-123));
        System.out.println(obj.reverse(120));
        System.out.println(obj.reverse(Integer.MAX_VALUE));
        System.out.println(obj.reverse(Integer.MIN_VALUE));
        System.out.println(obj.reverse(1534236469));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Math.abs(Integer.MIN_VALUE));
        int b = Integer.MAX_VALUE;
        int c = 1;
        long a = b + (long) c;
        System.out.println(a);

        System.out.println(-123/10);
        System.out.println(-123%10);
    }

    public int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            reverse = (reverse * 10) +  (x % 10);
            x = x / 10;
        };
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reverse;
    }

//    public int reverse(int x) {
//        int[] num = new int[10];
//        int len = 0;
//        do {
//            num[len++] = x % 10;
//            x = x / 10;
//        } while (x != 0);
//
//        long reverse = 0;
//        for (int i = len - 1; i >= 0; i--) {
//            reverse = reverse +  (long) num[i] * power(10, len - i - 1);
//        }
//        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
//            return 0;
//        }
//        return (int) reverse;
//    }

//    public int reverse(int x) {
//        int len = Integer.toString(x).length();
//        len = x > 0 ? len : len - 1;
//        long reverse = 0;
//        do {
//            reverse = reverse +  (long) (x % 10) * power(10, --len);
//            x = x / 10;
//        } while (x != 0);
//        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
//            return 0;
//        }
//        return (int) reverse;
//    }

//    public int power(int base, int exponent) {
//        int result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }
}
