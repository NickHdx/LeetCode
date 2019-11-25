package com.nick.leetcode;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
// Array/sort
public class No_4 {
    public static void main(String[] args) {
        No_4 obj = new No_4();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));

        nums1 = new int[] {1, 2};
        nums2 = new int[] {3, 4};
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        if (len != 0) {
//            ArrayList<Integer> sorted = new ArrayList<>();
//            int i = 0, j = 0;
//            while (i < len1 && j < len2) {
//                if (nums1[i] <= nums2[j]) {
//                    sorted.add(nums1[i++]);
//                } else {
//                    sorted.add(nums2[j++]);
//                }
//            }
//            while (i < len1) {
//                sorted.add(nums1[i++]);
//            }
//            while (j < len2) {
//                sorted.add(nums2[j++]);
//            }
//            if (len % 2 == 0) {
//                return (sorted.get(len / 2 - 1) + sorted.get(len / 2)) / 2.0;
//            } else {
//                return sorted.get(len / 2);
//            }

            int[] sorted = new int[len1 + len2];
            int i = 0, j = 0, k = 0;
            while (i < len1 && j < len2) {
                if (nums1[i] <= nums2[j]) {
                    sorted[k++] = nums1[i++];
                } else {
                    sorted[k++] = nums2[j++];
                }
            }
            while (i < len1) {
                sorted[k++] = nums1[i++];
            }
            while (j < len2) {
                sorted[k++] = nums2[j++];
            }
            if (len % 2 == 0) {
                return (sorted[len / 2 - 1] + sorted[len / 2]) / 2.0;
            } else {
                return sorted[len / 2];
            }
        }
        return 0;
    }
}
