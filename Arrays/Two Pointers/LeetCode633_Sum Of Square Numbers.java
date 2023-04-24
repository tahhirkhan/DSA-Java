https://leetcode.com/problems/sum-of-square-numbers/

class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long)Math.sqrt(c);
        while (start <= end) {
            long sum = (start * start) + (end * end);
            if (sum == c) {
                return true;
            }
            if (sum > c) {
                end--;
            }
            else {
                start++;
            }
        }
        return false;
    }
}
