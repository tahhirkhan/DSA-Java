package ArraySorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 7, 1, 0, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<arr.length; j++) {
                if (arr[j] < arr[j-1]) {
                    // swap:
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
