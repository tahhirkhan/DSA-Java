package BinarySearchQuestions;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers
//  Q: Search an element in the infinitely sorted array?
public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end+1;
            end = end + (end - start+1) * 2;
            start = temp;
        }
        // Apply Binary Search:
        int ans = search(arr, start, end, target);
        System.out.println(ans);
    }

    private static int search(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
