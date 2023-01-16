package SortingQuestions.CycleSortQs;
// https://leetcode.com/problems/find-the-duplicate-number/description/
// Q: Find the duplicate number in an array;
public class LeetCode287 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
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
                return arr[i];
            }
        }
        return end;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
