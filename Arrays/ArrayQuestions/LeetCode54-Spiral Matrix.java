https://leetcode.com/problems/spiral-matrix/description/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }

        int rStart = 0;
        int rEnd = matrix.length-1;
        int cStart = 0;
        int cEnd = matrix[0].length-1;

        while (rStart <= rEnd && cStart <= cEnd) {
            // Traverse Right:
            for (int i=cStart; i<=cEnd; i++) {
                list.add(matrix[rStart][i]);
            }
            rStart++;

            // Traverse Down:
            for (int i=rStart; i<=rEnd; i++) {
                list.add(matrix[i][cEnd]);
            }
            cEnd--;

            // Traverse Left (Only if there are more than 1 Columns)
            if (rStart <= rEnd) {
                for (int i=cEnd; i>=cStart; i--) {
                    list.add(matrix[rEnd][i]);
                } 
            }
            rEnd--;

            // TraversUp (Only if there are more than 1 rows)
            if (cStart <= cEnd) {
                for (int i=rEnd; i>=rStart; i--) {
                    list.add(matrix[i][cStart]);
                }
            }
            cStart++;
        }
        return list;
    }
}
