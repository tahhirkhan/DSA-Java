package Recursion.Basics;

import java.util.Arrays;

public class AllIndices {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 3, 6, 4};
        System.out.println(Arrays.toString(allIndices(arr, 2, 0, 0)));
    }
    public static int[] allIndices(int[] arr, int target, int index, int fsf) {
      
      // ============================= APPROACH 1 =============================
      
        if (index == arr.length) {
            return new int[fsf];
        }
        if (arr[index] == target) {
            fsf++;
        }
        int[] ans = allIndices(arr, target, index+1, fsf);
        if (arr[index] == target) {
            ans[fsf-1] = index;
        }
        return ans;

      // ============================= APPROACH 2 =============================

        if (index == arr.length) {
            return new int[fsf];
        }

        if (arr[index] == target) {
            int[] ans = allIndices(arr, target, index+1, fsf+1);
            ans[fsf] = index;
            return ans;
        }
        else {
            int[] ans = allIndices(arr, target, index+1, fsf);
            return ans;
        }
    }
}
