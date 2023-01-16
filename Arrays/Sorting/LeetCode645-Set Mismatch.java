package SortingQuestions.CycleSortQs;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/description/
// Q: Set Mismatch;
public class LeetCode645 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(search(arr)));
    }
    static int[] search(int[] nums) {
        int[] ans = new int[2];
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int correct = nums[start] - 1;
            if (nums[start] != nums[correct]) {
                swap(nums, start, correct);
            }
            else {
                start++;
            }
        }


        for (int i=0; i<nums.length; i++) {
            if (nums[i] != i+1) {
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
