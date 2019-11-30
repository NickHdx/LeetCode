package com.nick.leetcode;
//https://leetcode.com/problems/zigzag-conversion/
//String
public class No_6 {
    public static void main(String[] args) {
        No_6 obj = new No_6();
        String s = "PAYPALISHIRING";
        System.out.println(obj.convert(s, 3));
        System.out.println(obj.convert(s, 4));
        System.out.println(obj.convert(s, 1));
        System.out.println(obj.convert(s, 14));
        System.out.println(obj.convert(s, 19));
    }

    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0)
            return "";
        int len = s.length();
        int rowCount = Math.min(numRows, len);
        StringBuilder[] rows = new StringBuilder[rowCount];
        int i = 0;
        int r;
        int c;
        while (i < len) {
            r = 0;
            while (r < numRows && i < len) {
                if (rows[r] == null) {
                    rows[r] = new StringBuilder(len);
                }
                rows[r].append(s.charAt(i));
                r++;
                i++;
            }
            r = numRows - 2;
            c = 0;
            while (c < numRows - 2 && i < len) {
                rows[r].append(s.charAt(i));
                r--;
                c++;
                i++;
            }
        }
        StringBuilder result = new StringBuilder(len);
        for (int j = 0; j < rowCount; j++) {
            if (rows[j] != null) {
                result.append(rows[j]);
            }
        }
        return result.toString();
    }
}
