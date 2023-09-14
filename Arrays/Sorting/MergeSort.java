package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        arr = mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr, int s, int e) {
        if (s == e) {
            return new int[] {arr[s]};
        }
        int mid = s + (e-s) / 2;
        int[] firstSortedHalf = mergeSort(arr, s, mid);
        int[] secondSortedHalf = mergeSort(arr, mid+1, e);
        return mergeTwoSortedArrays(firstSortedHalf, secondSortedHalf);
    }
    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int[] finalSortedArray = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                finalSortedArray[k] = a[i];
                i++;
            }
            else {
                finalSortedArray[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            finalSortedArray[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            finalSortedArray[k] = b[j];
            j++;
            k++;
        }
        return finalSortedArray;
    }
}
