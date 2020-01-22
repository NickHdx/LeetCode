package com.nick.leetcode;

//https://leetcode.com/problems/search-insert-position/

public class No_35 {
    public static void main(String[] args) {
        No_35 obj = new No_35();
        System.out.println(obj.searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(obj.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(obj.searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(obj.searchInsert(new int[]{1, 3, 5, 6}, 0));
        System.out.println(obj.searchInsert(new int[]{}, 0));
        System.out.println(obj.searchInsert(new int[]{1, 3}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        if (target > nums[mid]) {
            return mid + 1;
        }
        return mid;
    }
}
