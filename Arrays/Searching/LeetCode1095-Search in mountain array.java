package BinarySearchQuestions;
// https://leetcode.com/problems/find-in-mountain-array/
//  Q: Search for an element in a mountain array?
public class LeetCode1095 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = search(arr, true, target);
        if (ans == -1) {
            ans = search(arr, false, target);
        }
        System.out.println(ans);
    }
    static int search(int[] arr, boolean isAscending, int target) {
        int peak = findPeak(arr);
        if (isAscending) {
            int start = 0;
            int end = peak;
            while (start <= end) {
                int mid = start + (end-start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target == arr[mid]) {
                    return mid;
                }
            }
        }
        else {
            int start = peak+1;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end-start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target == arr[mid]) {
                    return mid;
                }
            }
        }
        return -1;
    }

    private static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
