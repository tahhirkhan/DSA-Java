package Recursion.Basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
//        System.out.println(binarySearchIterative(arr, 6));
        System.out.println(binarySearchRecursive(arr, 6, 0, arr.length-1));
    }

  
    public static int binarySearchRecursive(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e-s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid+1, e);
        }
        return binarySearchRecursive(arr, target, s, mid-1);
    }

/*
    public static int binarySearchIterative(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
*/

}
