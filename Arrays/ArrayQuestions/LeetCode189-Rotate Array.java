https://leetcode.com/problems/rotate-array/description/
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        // Reverse whole array:
        Reverse(nums, 0, nums.length-1);

        // Reverse the first part:
        Reverse(nums, 0, k-1);

        // Reverse the second part:
        Reverse(nums, k, nums.length-1);
    }

    public void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // =========================BELOW SOLUTION GIVES TLE FOR LARGE ARRAY SIZE===================================
  
    // the below solution is also inplace and uses swapping approach, 
    // but gives time limit exceeded error for larger array size (Actually failed only one test case on LeetCode)

    // public void rotate(int[] nums, int k) {
    //     int n = nums.length-1;
        
    //     for (int i=0, x=n; i<k; i++) {
    //         int temp1 = nums[x];
    //         for (int j=0; j<=n; j++) {
    //             int temp2 = nums[j];
    //             nums[j] = temp1;
    //             temp1 = temp2;
    //         }
            
    //     }
        
    // }
}
