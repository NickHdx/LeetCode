package com.nick.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class No_350 {
    public static void main(String[] args) {
        No_350 obj = new No_350();
        System.out.println(Arrays.toString(obj.intersect(new int[] {1,2,2,1}, new int[] {2,2})));
        System.out.println(Arrays.toString(obj.intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4})));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums1) {
            if (!countMap.containsKey(n)) {
                countMap.put(n, 0);
            }
            countMap.put(n, countMap.get(n) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int m : nums2) {
            if (countMap.containsKey(m) && countMap.get(m) > 0) {
                resultList.add(m);
                countMap.put(m, countMap.get(m) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
