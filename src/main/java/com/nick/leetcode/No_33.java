package com.nick.leetcode;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class No_33 {
    public static void main(String[] args) {
        No_33 obj = new No_33();
        System.out.println(obj.search(new int[] {4,5,6,7,0,1,2}, 0));
        System.out.println(obj.search(new int[] {4,5,6,7,0,1,2}, 3));
        System.out.println(obj.search(new int[] {4,5,6,7,0,1,2}, 1));
        System.out.println(obj.search(new int[] {4,5,6,7,8,9,0,1,2,3}, 6));
        System.out.println(obj.search(new int[] {1}, 6));
        System.out.println(obj.search(new int[] {1}, 1));
        System.out.println(obj.search(new int[] {1,2,3,4,5,6,7}, 3));
        System.out.println(obj.search(new int[] {}, 3));
        System.out.println(obj.search(new int[] {3, 1}, 1));
    }

    public int search(int[] nums, int target) {
        int len = nums.length - 1;
        int low = 0, high = len, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target >= nums[0] && nums[0] > nums[mid]) {
                // move mid to the left area if target is the left area but mid is in the right area
                high = mid - 1;
            } else if (target <= nums[len] && nums[len] < nums[mid]) {
                // move mid to the right area if target is the right area but mid is in the left area
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
