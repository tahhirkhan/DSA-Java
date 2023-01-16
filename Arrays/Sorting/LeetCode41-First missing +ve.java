package SortingQuestions.CycleSortQs;

public class LeetCode41 {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(findMissing(nums));
    }
    static int findMissing(int[] nums) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int correct = nums[start] - 1;
            if ((nums[start] > 0 && nums[start] < end) && nums[start] != nums[correct]) {
                swap(nums, start, correct);
            }
            else {
                start++;
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return end+1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
