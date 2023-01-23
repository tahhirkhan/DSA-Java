https://leetcode.com/problems/maximum-population-year/description/
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int[] log : logs) {
            int by = log[0] - 1950;
            int dy = log[1] - 1950;
            arr[by]++;
            arr[dy]--;
        }
        int maxPop = arr[0];
        int year = 1950;
        for (int i=1; i<arr.length; i++) {
            arr[i] += arr[i-1];
            if (arr[i] > maxPop) {
                maxPop = arr[i];
                year = i+1950;
            }
        }
        return year;
    }
}
