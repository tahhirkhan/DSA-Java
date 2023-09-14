package Sorting;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {0, 7, 8, 9, 10, 11, 12, 13, 14};
        merge(a1, a2);
    }
    public static void merge(int[] a, int[] b) {
        int i=0;
        int j=0;
        int k=0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k] = a[i];
                i++;
            }
            else {
                ans[k] = b[j];
                j++;
            }
            k++;
        }
        if (i >= a.length) {
            while (j < b.length) {
                ans[k] = b[j];
                k++;
                j++;
            }
        }
        else {
            while (i < a.length) {
                ans[k] = a[i];
                i++;
                k++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
