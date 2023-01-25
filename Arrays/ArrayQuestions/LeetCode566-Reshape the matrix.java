https://leetcode.com/problems/reshape-the-matrix/description/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m*n != r*c) {
            return mat;
        }
        int[][] ans = new int[r][c];
        int rows = 0;
        int cols = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                ans[rows][cols] = mat[i][j];
                cols++;
                if (cols == c) {
                    cols = 0;
                    rows++;
                }
            }
        }
        return ans;
    }
}
