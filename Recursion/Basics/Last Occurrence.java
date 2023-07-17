package Recursion.Basics;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 4};
        System.out.println(lastOccurrence(arr, 2, 0));
    }
    public static int lastOccurrence(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        int occ = lastOccurrence(arr, target, index+1);
        if (occ != -1) {
            return occ;
        }
        if (arr[index] == target) {
            return index;
        }
        return -1;
    }
}
