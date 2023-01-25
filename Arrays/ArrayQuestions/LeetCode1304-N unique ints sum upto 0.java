https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n%2 == 0) {
            for (int i=0; i<n-1; i+=2) {
                ans[i] = n-i;
                ans[i+1] = -(n-i);
            }
        }
        else {
            ans[0] = 0;
            for (int i=1; i<n-1; i+=2) {
                ans[i] = i;
                ans[i+1] = -i;
            }
        }
        
        return ans;
    }
}
