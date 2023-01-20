https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            int temp = 0;
            while (i > 0) {
                i /= 10;
                temp++;
            }
            if (temp % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
