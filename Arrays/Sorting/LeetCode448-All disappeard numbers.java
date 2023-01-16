package SortingQuestions.CycleSortQs;

import ArrayBasics.ArrayLists;

import java.util.ArrayList;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
// Q: Find all numbers disappeared in an array?
public class LeetCode448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = new ArrayList<>();
        ans = List(arr);
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
                list.add(i+1);
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
