https://leetcode.com/problems/product-of-array-except-self/description/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1;
        int zeroCount = 0;
        int zeroIndex = 1;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            }
            else {
                product *= nums[i];
            }
        }

        if (zeroCount > 1) {
            return ans;
        }

        if (zeroCount == 1) {
            ans[zeroIndex] = product;
            return ans;
        }

        for (int i=0; i<ans.length; i++) {
            ans[i] = product / nums[i];
        }
        return ans;
    }
        
}
