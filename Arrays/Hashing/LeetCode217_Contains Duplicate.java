https://leetcode.com/problems/contains-duplicate/description/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int end = nums.length-1;
        // for (int i=0; i<nums.length; i++) {
        //     if (i < end && nums[i] == nums[i+1]) {
        //         return true;
        //     }
        // }
        // return false;

        // using the hashmap:
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            }
            else {
                map.put(n, 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                return true;
            }
        }
        return false;
    }
}
