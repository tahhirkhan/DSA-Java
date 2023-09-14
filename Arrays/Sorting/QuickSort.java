package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 3, 7, 2, 9, 6, 4};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high) {
        // base case:
        if (low >= high) {
            return;
        }
        int pivot = arr[high];
        int pi = partition(arr, pivot, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
//        partition(arr, pivot, low, high);
    }
    public static int partition(int[] arr, int pivot, int s, int e) {
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
        return j-1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
