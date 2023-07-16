package Recursion.Basics;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        decreasingIncreasing(5);
    }
    public static void decreasingIncreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        decreasingIncreasing(n-1);
        System.out.print(n+" ");
    }
}
