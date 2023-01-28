package BinarySearchQuestions;
// https://leetcode.com/problems/split-array-largest-sum/
// Q: Split array sum.
public class LeetCode410 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int min = 10;
        int max = 32;
        int k = 2;
        int ans = minSum(arr, k, min, max);
        System.out.println(ans);
    }
    static int minSum(int[] arr, int k, int start, int end) {
        while (start < end) {
            int mid = start + (end-start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if (pieces <= k) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
}
