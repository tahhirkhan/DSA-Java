https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentStreak = 0;
        int maxStreak = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                currentStreak++;
            }
            else {
                maxStreak = Math.max(currentStreak, maxStreak);
                currentStreak = 0;
            }
        }
        return Math.max(currentStreak, maxStreak);
    }
}
