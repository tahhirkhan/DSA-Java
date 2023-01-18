https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int counter = 0;
            for (int j=0; j<nums.length; j++) {
                if (nums[j] < nums[i]) {
                    counter++;
                }
            }
            ans[i] = counter;
        }
        return ans; 
    }
}
