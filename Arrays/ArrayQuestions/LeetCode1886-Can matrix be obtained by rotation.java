https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int x=0; x<4; x++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    public void rotate(int[][] mat) {

        // Flip the row order:
        int start = 0;
        int end = mat.length-1;
        while (start <= end) {
            int[] temp = mat[start];
            mat[start] = mat[end];
            mat[end] = temp;
            start++;
            end--;
        }

        // Inplace Transpose:
        for (int i=0; i<mat.length; i++) {
            for (int j=i+1; j<mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
