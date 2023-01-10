package BinarySearchQuestions;

import java.util.Arrays;

// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
// Q: Search a 2D Matrix II.
public class LeetCode240 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        int target = 2;

        System.out.println(search(matrix, target));
    }
    static boolean search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return true;

            }
            if (target < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }

        return false;
    }
}
