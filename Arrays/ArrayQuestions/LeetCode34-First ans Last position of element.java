https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    public int search(int[] nums, int target, boolean isFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (isFirstIndex) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else if (target < nums[mid]) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
