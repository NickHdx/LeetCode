package com.nick.leetcode;

//https://leetcode.com/problems/divide-two-integers/

public class No_29 {
    public static void main(String[] args) {
        No_29 obj = new No_29();
        System.out.println(obj.divide(10, 3));
        System.out.println(obj.divide(7, -3));
        System.out.println(obj.divide(-7, 3));
        System.out.println(obj.divide(1, 1));
        System.out.println(obj.divide(-1, -1));
        System.out.println(obj.divide(-1, 1));
        System.out.println(obj.divide(0, 1));
        System.out.println(obj.divide(Integer.MIN_VALUE, 1));
        System.out.println(obj.divide(Integer.MIN_VALUE, -1));
        System.out.println(obj.divide(-14, 3));
        System.out.println(obj.divide(2147483647, 1));
    }

    public int divide(int dividend, int divisor) {
        int sign = 1;
        if ((divisor < 0 && dividend >= 0) || (divisor >= 0 && dividend < 0)) {
            sign = -1;
        }
        long a = dividend;
        a = Math.abs(a);
        long b = divisor;
        b = Math.abs(b);

        if (b > a) {
            return 0;
        } else if (b == a){
            return sign;
        } else {
            long mid, low = 1, high = a, result = 0;
            while(low <= high) {
                mid = low + (high - low) / 2;
                if (mid * b < a) {
                    result = mid;
                    low = mid + 1;
                } else if (mid * b > a) {
                    high = mid - 1;
                } else {
                    result = mid;
                    break;
                }
            }
            result = sign < 0 ? -result : result;
            return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? Integer.MAX_VALUE : (int) result;
        }
    }

//    public int divide(int dividend, int divisor) {
//        int sign = 1;
//        if ((divisor < 0 && dividend >= 0) || (divisor >= 0 && dividend < 0)) {
//            sign = -1;
//        }
//        long a = dividend;
//        a = Math.abs(a);
//        long b = divisor;
//        b = Math.abs(b);
//        long result = 0;
//
//        while (b <= a) {
//            a -= b;
//            result++;
//        }
//
//        result = sign < 0 ? -result : result;
//        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? Integer.MAX_VALUE : (int) result;
//    }
}
