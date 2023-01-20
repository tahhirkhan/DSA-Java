https://leetcode.com/problems/matrix-diagonal-sum/description/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i=0; i<n; i++) {
            sum += mat[i][i] + mat[i][n-1-i];
        }
        if (n % 2 != 0) {
            int mid = n/2;
            int m = mat[mid][mid];
            sum -= m; 
        }
        return sum;
    }
}
