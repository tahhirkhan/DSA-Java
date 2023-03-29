https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = nums.length;
        // Add the elements of the array to the hashMap;
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }
            else {
                map.put(n, 1);
            }
        }

        // Traverse the hashMap to find the element occurring more than n/2 times;
        // We traverse the hashMap using keySet();
        for (int key : map.keySet()) {
            if (map.get(key) > s/2) {
                return key;
            }
        }
        return -1;
    }
}
