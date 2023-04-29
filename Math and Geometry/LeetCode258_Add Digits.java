https://leetcode.com/problems/add-digits/description/

class Solution {
    public int addDigits(int n) {
        if (n <= 9) {
            return n;
        }
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        if (sum <= 9) {
            return sum;
        }
        return addDigits(sum);
    }
}
