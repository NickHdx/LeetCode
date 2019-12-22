package com.nick.leetcode;
//https://leetcode.com/problems/string-to-integer-atoi/
public class No_8 {
    public static void main(String[] args) {
        No_8 obj = new No_8();
        String str = "42";
        System.out.println(obj.myAtoi(str));
        str = "-42";
        System.out.println(obj.myAtoi(str));
        str = "4193 with words";
        System.out.println(obj.myAtoi(str));
        str = "words and 987";
        System.out.println(obj.myAtoi(str));
        str = "-91283472332";
        System.out.println(obj.myAtoi(str));
        str = "    +48 action";
        System.out.println(obj.myAtoi(str));
        str = "    ";
        System.out.println(obj.myAtoi(str));
        str = "9223372036854775808";
        System.out.println(obj.myAtoi(str));
    }

    public int myAtoi(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if ((str.charAt(i) >= 48 && str.charAt(i) <= 57) || str.charAt(i) == '-' || str.charAt(i) == '+') {
                    int sign = 1;
                    long num = 0;
                    int begin = i;
                    if (str.charAt(i) == '-') {
                        sign = -1;
                        begin = i + 1;
                    }
                    if (str.charAt(i) == '+') {
                        sign = 1;
                        begin = i + 1;
                    }

                    for (int j = begin; j < str.length(); j++) {
                        if (str.charAt(j) >= 48 && str.charAt(j) <= 57) {
                            num = num * 10 + (str.charAt(j) - 48);
                            if (num > 2147483648L) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }

                    num = sign * num;
                    if (num > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    if (num < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                    return (int) num;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }
}
