https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     int i = 0;
    //     int j = nums.length-1;

    //     while (i < nums.length && j > 0) {
    //         if (nums[i] + nums[j] == target) {
    //             return new int[]{i+1, j+1};
    //         }

    //         if (nums[i] + nums[j] > target) {
    //             j--;
    //         }
    //         else {
    //             i++;
    //         }
    //     }

    //     return new int[]{-1, -1};
    // }

    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        while (nums[i] + nums[j] != target) {

            if (nums[i] + nums[j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return new int[]{i + 1, j + 1};
    }
}
