https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i=0; i<nums.length; i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start <= end) {
                int mid = start + (end-start) / 2;
                if (nums[i] + nums[mid] == target) {
                    return new int[] {i+1, mid+1};
                }
                if (nums[i] + nums[mid] > target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
