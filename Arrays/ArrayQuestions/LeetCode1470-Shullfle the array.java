https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] ans = new int[n*2];
       for (int i=0; i<n; i++) {
           ans[i+i] = nums[i];
           ans[i+i+1] = nums[i+n];
       }
       return ans; 
    }
}
