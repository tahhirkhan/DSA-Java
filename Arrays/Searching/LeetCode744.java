package BinarySearchQuestions;

public class LeetCode744 {
    public static void main(String[] args) {

//  Q: Find the smallest letter greater than target.

        char[] arr = {'a', 'z'};
        char target = 'y';
        char ans = search(arr, target);
        System.out.println(ans);
    }

    private static char search(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end-start) / 2;
            if (target > arr[mid]) {
                start = mid+1;
            }
            else if (target < arr[mid]) {
                end = mid-1;
            }
        }
        return arr[start % arr.length];
    }
}
