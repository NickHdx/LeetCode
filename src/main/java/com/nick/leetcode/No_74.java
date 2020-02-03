package com.nick.leetcode;

//https://leetcode.com/problems/search-a-2d-matrix/

public class No_74 {
    public static void main(String[] args) {
        No_74 obj = new No_74();
        int[][] a = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println(obj.searchMatrix(a, 3));
        System.out.println(obj.searchMatrix(a, 13));
        System.out.println(obj.searchMatrix(a, 1));
        System.out.println(obj.searchMatrix(a, 20));
        System.out.println(obj.searchMatrix(a, 50));
        System.out.println(obj.searchMatrix(a, 10));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length > 0) {
            int rowLen = matrix.length;
            int colLen = matrix[0].length;
            int low = 1;
            int high = rowLen * colLen;
            while(low <= high) {
                int mid = (low + high) / 2;
                int rowIndex = mid / colLen != 0 ? (mid % colLen != 0 ? mid / colLen : mid / colLen - 1) : 0;
                int colIndex = mid % colLen != 0 ? mid % colLen - 1 : colLen - 1;
                if (matrix[rowIndex][colIndex] > target) {
                    high = mid - 1;
                } else if (matrix[rowIndex][colIndex] < target) {
                    low = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
