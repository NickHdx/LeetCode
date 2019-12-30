package com.nick.leetcode;

//https://leetcode.com/problems/container-with-most-water/
public class No_11 {
    public static void main(String[] args) {
        No_11 obj = new No_11();
        System.out.println(obj.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (max < (j - i) * (height[j] < height[i] ? height[j] : height[i])) {
                    max = (j - i) * (height[j] < height[i] ? height[j] : height[i]);
                }
            }
        }
        return max;
    }

//    public int maxArea(int[] height) {
//        int max = 0;
//        int left = 0, right = height.length - 1;
//        while (left < right) {
//            max = Math.max(max, (right - left) * (height[right] < height[left] ? height[right] : height[left]));
//            if (height[right] < height[left]) {
//                right--;
//            } else {
//                left++;
//            }
//        }
//        return max;
//    }
}
