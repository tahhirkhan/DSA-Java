https://www.codingninjas.com/studio/problems/count-frequency-in-a-range_8365446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


import java.util.HashMap;

public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[n];

        for (int num : nums) {
            if (map.containsKey(num)) {
                int f = map.get(num) + 1;
                map.put(num, f);
            }
            else {
                map.put(num, 1);
            }
        }

        for(int i=0; i<nums.length; i++) {
            if (map.containsKey(i+1)) {
                ans[i] = map.get(i+1);
            }
            else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}
