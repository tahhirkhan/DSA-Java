https://leetcode.com/problems/happy-number/description/

class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            fast = findSquare(findSquare(fast));
            slow = findSquare(slow);
        }
        while(fast != slow);
        if (fast == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int n){
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}
