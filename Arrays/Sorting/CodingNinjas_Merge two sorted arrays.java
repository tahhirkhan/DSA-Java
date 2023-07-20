https://www.codingninjas.com/studio/problems/ninja-and-sorted-arrays_1214628?leftPanelTab=0

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int x = m - 1;
        int y = n - 1;
        int last = m + n - 1;
        while (y >= 0 ) {
            if (x >= 0 && arr1[x] >= arr2[y]) {
                arr1[last] = arr1[x];
                x--;
            } else {
                arr1[last] = arr2[y];
                y--;
            }
            last--;
        }
        return arr1;
    }
}
