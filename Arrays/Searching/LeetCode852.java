package BinarySearchQuestions;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
//  Q: Find the peak index in the mountain array?
public class LeetCode852 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 10, 9, 8, 1};
        int ans = search(arr);
        System.out.println(ans);
    }

    private static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else if(arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
