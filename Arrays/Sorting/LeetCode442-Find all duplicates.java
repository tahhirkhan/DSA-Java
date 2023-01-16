package SortingQuestions.CycleSortQs;

import java.util.ArrayList;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
// Q: Find all duplicates in an array;
public class LeetCode442 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        ArrayList<Integer> ans = List(arr);

        System.out.println(ans);
    }
    static ArrayList<Integer> List(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int correct = arr[start] - 1;
            if (arr[start] != arr[correct]) {
                swap(arr, start, correct);
            }
            else {
                start++;
            }
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i] != i+1) {
                list.add(arr[i]);
            }
        }

        return list;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
