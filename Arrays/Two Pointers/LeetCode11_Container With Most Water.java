https://leetcode.com/problems/container-with-most-water/description/

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;
        while (start < end) {
            int length = Math.min(height[start], height[end]);
            int width = end - start;
            maxArea = Math.max(length*width, maxArea);
            if (height[start] <= height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return maxArea;
    }
}
