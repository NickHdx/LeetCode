package com.nick.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/intersection-of-two-arrays/

public class No_349 {
    public static void main(String[] args) {
        No_349 obj = new No_349();
        System.out.println(Arrays.toString(obj.intersection(new int[] {1,2,2,1}, new int[] {2,2})));
        System.out.println(Arrays.toString(obj.intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4})));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int max = 0;
        for (int i : nums1) {
            if (max < i) {
                max = i;
            }
        }

        for (int i : nums2) {
            if (max < i) {
                max = i;
            }
        }

        int[] temp = new int[max + 1];
        for (int i : nums1) {
            temp[i]++;
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int i : nums2) {
            if (temp[i] > 0) {
                resultSet.add(i);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (Integer v : resultSet) {
            result[i++] = v;
        }
        return result;
    }
}
