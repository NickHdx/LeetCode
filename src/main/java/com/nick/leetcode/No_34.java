package com.nick.leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class No_34 {
    public static void main(String[] args) {
        No_34 obj = new No_34();
        System.out.println(Arrays.toString(obj.searchRange(new int[] {5,7,7,8,8,10}, 8)));
        System.out.println(Arrays.toString(obj.searchRange(new int[] {5,7,7,8,8,10}, 6)));
        System.out.println(Arrays.toString(obj.searchRange(new int[] {5,7,7,8,8,10}, 7)));
        System.out.println(Arrays.toString(obj.searchRange(new int[] {5}, 7)));
        System.out.println(Arrays.toString(obj.searchRange(new int[] {}, 6)));
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        int low = 0;
        int high = nums.length - 1;
        int mid;
        int p = -1;
        while(low <= high) {
            mid = (high + low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                p = mid;
                break;
            }
        }

        if (p != -1) {
            int begin = p;
            int end = p;
            while (begin - 1 >= 0 && nums[begin - 1] == target) {
                begin--;
            }
            while (end + 1 < nums.length && nums[end + 1] == target) {
                end++;
            }
            return new int[] {begin, end};
        }
        return new int[] {-1, -1};
    }


//    // returns leftmost (or rightmost) index at which `target` should be
//    // inserted in sorted array `nums` via binary search.
//    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
//        int lo = 0;
//        int hi = nums.length;
//
//        while (lo < hi) {
//            int mid = (lo + hi) / 2;
//            if (nums[mid] > target || (left && target == nums[mid])) {
//                hi = mid;
//            }
//            else {
//                lo = mid+1;
//            }
//        }
//
//        return lo;
//    }
//
//    public int[] searchRange(int[] nums, int target) {
//        int[] targetRange = {-1, -1};
//
//        int leftIdx = extremeInsertionIndex(nums, target, true);
//
//        // assert that `leftIdx` is within the array bounds and that `target`
//        // is actually in `nums`.
//        if (leftIdx == nums.length || nums[leftIdx] != target) {
//            return targetRange;
//        }
//
//        targetRange[0] = leftIdx;
//        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;
//
//        return targetRange;
//    }
}
