package BinarySearchQuestions;
// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
// Q: Kth Smallest Element in a Sorted Matrix
public class LeetCode378 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int ans = smallest(matrix, 8);
        System.out.println(ans);
    }

    private static int smallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        int counter = 0;
        int[] arr = new int[m * n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr[counter] = matrix[i][j];
                counter++;
            }
        }
        return arr[k-1];
    }
}
