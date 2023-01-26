https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i : position) {
            if (i%2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        return Math.min(evenCount, oddCount);
    }
}
