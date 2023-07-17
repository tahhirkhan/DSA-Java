package Recursion.Basics;

public class maxOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 201, 3, 43, 5};
        System.out.println(max(arr, 0));
    }
    public static int max(int[] arr, int index) {
        if (index == arr.length-1) {
            return arr[index];
        }
        int ans = max(arr, index+1);
        if (ans > arr[index]) {
            return ans;
        }
        return arr[index];
    }
}
