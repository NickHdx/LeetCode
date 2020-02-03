package com.nick.leetcode;

//https://leetcode.com/problems/sqrtx/

public class No_69 {
    public static void main(String[] args) {
        No_69 obj = new No_69();
        System.out.println(obj.mySqrt(4));
        System.out.println(obj.mySqrt(8));
        System.out.println(obj.mySqrt(0));
        System.out.println(obj.mySqrt(2));
        System.out.println(obj.mySqrt(Integer.MAX_VALUE));
    }

    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((long)mid * (long)mid > (long)x) {
                high = mid - 1;
            } else if ((long)mid * (long)mid < (long)x) {
                result = mid;
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return result;
    }
}