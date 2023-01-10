package BinarySearchQuestions;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Q: Search in Rotated Sorted Array?
public class LeetCode33 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 0, 1, 2};
        int pivot = findPivot(arr);
        int t = 2;
        int ans = search(arr, 0, pivot, t);
        if (ans == -1) {
            ans = search(arr, pivot+1, arr.length-1, t);
        }
        System.out.println(ans);
    }
    // Binary Search:
    static int search(int[] arr, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e-s) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return -1;
    }


    // Find Pivot:
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;

            if (arr[mid] > arr[mid+1] && mid < end) {
                return mid;
            }

            if (arr[mid] < arr[mid-1] && mid > start) {
                return mid-1;
            }

            if (arr[mid] < arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
