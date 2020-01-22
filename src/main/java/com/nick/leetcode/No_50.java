package com.nick.leetcode;

//https://leetcode.com/problems/powx-n/

public class No_50 {
    public static void main(String[] args) {
        No_50 obj = new No_50();

        System.out.println(obj.myPow(2.0, 10));
        System.out.println(Math.pow(2, 10));

        System.out.println(obj.myPow(2.1, 3));
        System.out.println(Math.pow(2.1, 3));

        System.out.println(obj.myPow(2.0, -2));
        System.out.println(Math.pow(2, -2));

        System.out.println(obj.myPow(0.00001, 2147483647));
        System.out.println(Math.pow(0.00001, 2147483647));
    }

    public double myPow(double x, int n) {
        double result = positivePow(x, Math.abs(n));
        return n > 0 ? result : 1/result;
    }

    public double positivePow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double result = positivePow(x, n / 2);

        if (n % 2 == 0) {
            return result * result;
        } else {
            return result * result * x;
        }
    }
}
