https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int min = matrix[0][0];
        int col = 0;
        // Find minimum element in the row:
        for (int i=0; i<matrix.length; i++) {
            min = matrix[i][0];
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            // Check if it is max in coloumn:
            if (isMaxInCol(matrix, col, min)) {
                ans.add(min);
            }
        }
        return ans;
    }
    public boolean isMaxInCol(int[][] mat, int minCol, int min) {
        for (int i=0; i<mat.length; i++) {
            if (mat[i][minCol] > min) {
                return false;
            }
        }
        return true;
    }
}
