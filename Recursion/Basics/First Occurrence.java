package Recursion.Basics;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4};
        System.out.println(firstOccurrence(arr, 0, 4));
    }
    public static int firstOccurrence(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return firstOccurrence(arr, index+1, target);
    }
}
