https://leetcode.com/problems/sqrtx/description/
class Solution {
    public int mySqrt(int x) {
        long start = 0; 
        long end = x/2;
        long mid = (start + end) / 2;
        while (start <= end) {
            if (x==1) {
                mid = 1;
            }
            if (mid*mid == x) {
                break;
            }
            else if (mid*mid > x) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return (int)mid;
    }
}
