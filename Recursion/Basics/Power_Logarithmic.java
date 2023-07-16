package Recursion.Basics;

public class Power_Logarithmic {
    public static void main(String[] args) {
        System.out.println(power(2, 6));
    }
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int ans = power(x, n/2) * power(x, n/2);
        if (n % 2 == 1) {
            ans *= x;
        }
        return ans;
    }
}
