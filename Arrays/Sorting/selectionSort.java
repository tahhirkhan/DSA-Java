package ArraySorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 2, 9, 0, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        int end = arr.length-1;
        for (int i=0; i<arr.length; i++) {
            int max = findMax(arr, end);
            // swap:
            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
    static int findMax(int[] arr, int end) {
        int max = 0;
        int start = 0;
        while (start <= end) {
            if (arr[start] > arr[max]){
                max = start;
            }
            start++;
        }
        return max;
    }
}
