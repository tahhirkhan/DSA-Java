package BinarySearchQuestions;
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
// Q: Search in Rotated sorted array with having duplicates present in it?
public class LeetCode81 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        int pivot = findPeakInDuplicates(arr);
        boolean ans = binarySearch(arr, 0, pivot, target);
        if (!ans) {
            ans = binarySearch(arr, pivot+1, arr.length-1, target);
        }
        System.out.println(ans);
    }
    static boolean binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return true;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return false;
    }
    static int findPeakInDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the first, middle & last indices then.
                // but there might be the pivot in them, so check that out first, here goes:
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            }
            // for the pivot to be in either right or left sides:
            // 1: Check in right side.
            if (arr[mid] > arr[start] || arr[mid] == arr[start] && arr[mid] > arr[end]) {
                start = mid + 1;
            }
            // 2: Check in left side.
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
