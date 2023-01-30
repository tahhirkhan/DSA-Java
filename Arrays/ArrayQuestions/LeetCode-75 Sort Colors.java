https://leetcode.com/problems/sort-colors/description/

// Solved using Selection Sort(best time and space complexity):
class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int max = FindMax(nums, start, end);
            // swap max with end;
            int temp = nums[end];
            nums[end] = nums[max]; 
            nums[max] = temp;
            end--;
        }
    }

    public int FindMax(int[] arr, int start, int end) {
        int temp = 0;
        for (int i=start; i<=end; i++) {
            if (arr[i] > arr[temp]) {
                temp = i;
            }
        }
        return temp; 
    }
}
