https://leetcode.com/problems/most-frequent-even-element/

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array to count the frequency of each even element
        // and add that to the HashMap;
        for (int n : nums) {
            if (n % 2 == 0) {
                if (map.containsKey(n)) {
                    map.put(n, map.get(n)+1);
                }
                else {
                    map.put(n, 1);
                }
            }
        }

        // Traverse the map and find the most frequent even element:
        int maxFrequency = -1;
        int ans = -1;

        for (int key : map.keySet()) {
            if (map.get(key) > maxFrequency) {
                maxFrequency = map.get(key);
                ans = key;
            }
            else if (map.get(key) == maxFrequency && key < ans) {
                ans = key;
            }
        }
        return ans;
    }
}
