https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] matrix = new int[m][n];
        for (int i=0; i<indices.length; i++) {

            int r = indices[i][0];
            int c = indices[i][1];

            for (int j=0; j<m; j++) {
                matrix[j][c]++;
            }

            for (int k=0; k<n; k++) {
                matrix[r][k]++;
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
