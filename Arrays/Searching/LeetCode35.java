package BinarySearchQuestions;
// https://leetcode.com/problems/search-insert-position/
// Q: Search Insert Position.
public class LeetCode35 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 7;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
//        if (target > arr[end]) {
//            return end+1;
//        }
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
