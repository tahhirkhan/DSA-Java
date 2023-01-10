package BinarySearchQuestions;

import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] matrix = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {11, 13, 15, 17, 19},
                {12,14,16,18,20},
                {21,22,23,24,25}
        };
        int target = 13;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] binarySearch(int[][] matrix, int row, int rStart, int rEnd, int target) {
        while (rStart <= rEnd) {
            int mid = rStart + (rEnd-rStart) / 2;
            if (target == matrix[row][mid]) {
                return new int[]{row, mid};
            }
            if (target < matrix[row][mid]) {
                rEnd = mid - 1;
            }
            else {
                rStart = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;


        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        if (cols == 0) {
            return new int[]{-1,-1};
        }

        int cStart = 0;
        int cEnd = rows-1;
        int midCol = cols/2;

        while (cStart < (cEnd-1)) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (target == matrix[mid][midCol]) {
                return new int[] {mid, midCol};
            }
            if (target < matrix[mid][midCol]) {
                cEnd = mid;
            }
            else {
                cStart = mid;
            }
        }

        // if only two rows are remaining:
        midCol = (cols-1) / 2;
        if (target == matrix[cStart][midCol]) {
            return new int[]{cStart, midCol};
        }
        if (target == matrix[cStart+1][midCol]) {
            return new int[]{cStart+1, midCol};
        }

        // first half
        if (target <= matrix[cStart][midCol-1]) {
            return binarySearch(matrix, cStart, 0, midCol-1, target);
        }

        // second half
        else if ((midCol < (cols-1) && target >= matrix[cStart][midCol+1]) && (target <= matrix[cStart][cols-1])) {
            return binarySearch(matrix, cStart, midCol+1, cols-1, target);
        }

        // third half
        else if (target <= matrix[cStart+1][midCol-1]) {
            return binarySearch(matrix, cStart+1, cStart+1, midCol-1, target);
        }

        // fourth half
        else {
            return binarySearch(matrix, cStart+1, midCol+1, cols-1, target);
        }
    }
}
