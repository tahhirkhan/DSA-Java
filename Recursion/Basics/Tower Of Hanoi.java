package Recursion.Basics;

// Print the instructions:

public class TowerOfHanoi {
    public static void main(String[] args) {
        print(3, 10, 11, 12);
    }
    public static void print(int n, int t1, int t2, int t3) {
        if (n == 0) {
            return;
        }
        print(n-1, t1, t3, t2);
        System.out.println(n+"["+t1+" -> "+t2+"]");
        print(n-1, t3, t2, t1);
    }
}
