https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = nums.length;

        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }
            else {
                map.put(n, 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > s/3) {
                list.add(key);
            }
        }
        return list;
    }
}
