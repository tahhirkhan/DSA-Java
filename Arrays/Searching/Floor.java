package BinarySearchQuestions;

public class Floor {
    public static void main(String[] args) {
        // find the floor of a number:

        int[] arr = {1, 2, 3, 4, 5, 7, 8};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(arr[ans]);
    }

    private static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }
        }
        return end;
    }
}
