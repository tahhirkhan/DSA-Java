package Sorting;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] arr = {9, 12, 5, 10, 14, 3, 10};

        System.out.println(Arrays.toString(partition(arr, 10)));
    }
    public static int[] partition(int[] arr, int pivot) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            }
            else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
