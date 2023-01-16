package SortingQuestions.CycleSortQs;
// https://leetcode.com/problems/missing-number/submissions/878634971/
// Q: Missing Number
public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 0, 3, 2};
        System.out.println(sort(arr));
    }
    static int sort(int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int correct = arr[start];
            if (arr[start] < arr.length && arr[start] != arr[correct]) {
                swap(arr, start, correct);
            }
            else {
                start++;
            }
        }
        for (int i=0; i< arr.length; i++) {
            if (arr[i] != i) {
                return i;
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
