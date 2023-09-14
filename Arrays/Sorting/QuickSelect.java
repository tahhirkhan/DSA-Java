package Sorting;

// Q: Find the kth smallest element in the array?
public class QuickSelect {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 8, 7, 6};
        int k = 3;
        System.out.println(quickSelect(arr, 0, arr.length-1, k-1));
    }
    public static int quickSelect(int[] arr, int lo, int hi, int k) {
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        if (pi > k) {
            return quickSelect(arr, lo, pi - 1, k);
        }
        if (pi < k) {
            return quickSelect(arr, pi+1, hi, k);
        }
        return arr[pi];
    }

    private static int partition(int[] arr, int pivot, int s, int e) {
        int i=s, j=s;
        while (i <= e) {
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

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
