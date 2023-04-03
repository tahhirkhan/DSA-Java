https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {

//         _____________________Brute Force Approach______________________

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};





        // _____________________Using HashMap (Two Pass)_____________________

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans) && map.get(ans) != i) {
                return new int[] {i, map.get(ans)};
            }
        }
        return new int[] {-1, -1};


      
      
      

        // _____________________Using HashMap (One Pass)_____________________

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans) && map.get(ans) != i) {
                return new int[] {i, map.get(ans)};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
