package Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 1, 11, 8, 6, 1, 15, 3, 12, 2};
        System.out.println(Arrays.toString(sequence(arr)));
    }
    public static int[] sequence(int[] arr) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            map.put(num , true);
        }

        for (int num : map.keySet()) {
            if (map.containsKey(num-1)) {
                map.put(num, false);
            }
        }
        int maxLength = 0;
        int maxSeqStartPoint = 0;
        for (int num : map.keySet()) {
            int tempLength = 1;
            if (map.get(num)) {
                while (map.containsKey(num+tempLength)) {
                    tempLength++;
                }
                if (tempLength >= maxLength) {
                    maxLength = tempLength;
                    maxSeqStartPoint = num;
                }
            }
        }
        int[] ans = new int[maxLength];
        ans[0] = maxSeqStartPoint;
        for (int i=1; i<ans.length; i++) {
            ans[i] = maxSeqStartPoint+1;
            maxSeqStartPoint++;
        }
        return ans;
    }
}
