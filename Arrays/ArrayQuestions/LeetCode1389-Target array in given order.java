https://leetcode.com/problems/create-target-array-in-the-given-order/description/

package ArrayBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        int[] index = {0, 1, 2, 2, 1};
        int[] nums = {0, 1, 2, 3, 4};
        int[] ans = function(index, nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] function(int[] index, int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[nums.length];
        for (int i=0; i< nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for(int i=0; i<nums.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
