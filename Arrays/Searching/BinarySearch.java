package Basics;

import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int target = 6;
        int start = 0;
        int end = arr.length - 1;

        int ans = search(arr, start, end, target);
        System.out.println(ans);
//
//        ====================================
//        printing the elements of array:
//        for (int element : arr) {
//            System.out.print(element+" ");
//        }
//        ====================================
    }


//    ================== METHOD 1 ===================

//    static int search(int[] arr) {
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        int target = 2;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target > arr[mid]) {
//                start = mid + 1;
//            }
//            else if (target < arr[mid]) {
//                end = mid - 1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return -1;
//    }




//    ================== METHOD 2 ===================
    static int search(int[] arr, int s, int e, int t) {


            int m = s + (e - s) / 2;

            if (t < arr[m]) {
                return search(arr, s, m-1, t);
            }
            else if (t > arr[m]) {
                return search(arr, m+1, e, t);
            }
            else if (t == arr[m]){
                return m;
            }

        return -1;
    }
}
