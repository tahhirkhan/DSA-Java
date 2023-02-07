package BinarySearchQuestions;
// https://leetcode.com/problems/detect-capital/description/
// Q: Detect Capital.
import java.util.Scanner;

public class LeetCode520 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String str = in.next();

        System.out.println(detectCapitalUse(str));
    }
    static boolean detectCapitalUse(String word) {
        int n = word.length();
        boolean case1 = true;
        boolean case2 = true;
        boolean case3 = true;

        // case1: All are capital.
        for (int i=0; i<n; i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                case1 = false;
                break;
            }
        }
        if (case1) {
            return true;
        }



        // case2: None are capital.
        for (int i=0; i<n; i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                case2 = false;
                break;
            }
        }
        if (case2) {
            return true;
        }



        // case3: Only first letter is capital.
        if (!Character.isUpperCase(word.charAt(0))) {
            case3 = false;
        }

        if (case3) {
            for (int i=1; i<n; i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    case3 = false;
                    break;
                }
            }
        }
        return case3;

    }
}
