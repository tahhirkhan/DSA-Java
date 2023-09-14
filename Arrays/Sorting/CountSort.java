package Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9};
        countSort(arr, 3, 9);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr, int min, int max) {

        int[] freqArray = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i] - min] += 1;
        }

        prefixSum(freqArray); // calculate the prefix sum of the frequencies.

        int[] ans = new int[arr.length];

        // run backward loop on the original array and fill the positions in ans array using the original array
        // and the frequency array.
        for (int i=arr.length-1; i>=0; i--) {
            int index = freqArray[arr[i]-min]-1; // -1 at last because index = position - 1;
            ans[index] = arr[i];
            freqArray[arr[i]-min]--; // reduce the frequency by 1.
        }

        // fill the original array with the answer array.
        for (int i=0; i<ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    private static void prefixSum(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            arr[i] += arr[i-1];
        }
    }
}
