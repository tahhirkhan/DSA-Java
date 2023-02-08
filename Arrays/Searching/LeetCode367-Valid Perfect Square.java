https://leetcode.com/problems/valid-perfect-square/description/
class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        while (start <= end) {
            long mid = start + (end-start) / 2;
            if (mid*mid == num) {
                return true;
            } 
            if (mid*mid > num) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return false;
    }
}
