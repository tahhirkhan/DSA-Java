https://leetcode.com/problems/remove-element/description/

class Solution {
    public int removeElement(int[] nums, int val) {
        // int i = 0;
        // int j = 0;
        // while (j < nums.length) {
        //     if (nums[j] != val) {
        //         nums[i] = nums[j];
        //         i++;
        //     }
        //     j++;
        // }
        // return i;

        int i=0;
        int n=nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n-1];
                n--;
            }
            else {
                i++;
            }
        }
        return n;
    }
}
