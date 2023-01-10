package BinarySearchQuestions;
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
// Q: Count Negative Numbers in a Sorted Matrix.
public class LeetCode1351 {
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
        int counter = 0;
        int m = grid.length-1;
        int n = grid[0].length-1;
        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (grid[i][j] < 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
