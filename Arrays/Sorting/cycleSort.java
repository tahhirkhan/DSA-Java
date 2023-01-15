package ArraySorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
//    static void sort(int[] arr) {
//        for (int i=0; i<arr.length; i++) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                swap(arr, i, correct);
//            }
//        }
//    }
    static void sort(int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int correct = arr[start] - 1;
            if (arr[start] != arr[correct]) {
                swap(arr, start, correct);
            }
            else {
                start++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
