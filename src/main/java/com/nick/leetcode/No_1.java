package com.nick.leetcode;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
//array
public class No_1 {
    public static void main(String[] args) {
        No_1 object = new No_1();
        System.out.println(Arrays.toString(object.twoSum(new int[] {2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[] {i, numMap.get(target - nums[i])};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
