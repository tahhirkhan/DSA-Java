https://www.codingninjas.com/studio/problems/reverse-an-array_8365444?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        return helper(nums, n, 0);
    }
    public static int[] helper(int[] arr, int n, int i) {
        if (n == 0) {
            return new int[arr.length];
        }
        int[] ans = helper(arr, n-1, i+1);
        ans[i] = arr[n-1];
        return ans;
    }
}
