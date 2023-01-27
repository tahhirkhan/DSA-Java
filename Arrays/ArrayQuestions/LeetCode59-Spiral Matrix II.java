https://leetcode.com/problems/spiral-matrix-ii/description/
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int rStart = 0;
        int rEnd = n-1;
        int cStart = 0;
        int cEnd = n-1;
        int val = 1;
        while (rStart <= rEnd && cStart <= cEnd) {
            // traverse right;
            for (int i=cStart; i<=cEnd; i++) {
                mat[rStart][i] = val;
                val++;
            }
            rStart++;

            // traverse down:
            for (int i=rStart; i<=rEnd; i++) {
                mat[i][cEnd] = val;
                val++;
            }
            cEnd--;

            // traverse left:
            if (rStart <= rEnd) {
                for (int i=cEnd; i>=cStart; i--) {
                    mat[rEnd][i] = val;
                    val++;
                }
            }
            rEnd--;

            // traverse up:
            if (cStart <= cEnd) {
                for (int i=rEnd; i>=rStart; i--) {
                    mat[i][cStart] = val;
                    val++;
                }
            }
            cStart++;
        }
        return mat;
    }
}
