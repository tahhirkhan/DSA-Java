package BinarySearchQuestions;
// https://leetcode.com/problems/search-a-2d-matrix/description/
// Q: Search a 2D Matrix.
public class LeetCode74 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 3;
        System.out.println(search(matrix, target));
    }
    static boolean search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
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
