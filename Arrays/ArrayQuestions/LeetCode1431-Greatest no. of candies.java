https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = findMax(candies);
        for (int i=0; i<candies.length; i++) {
            int temp = candies[i] + extraCandies;
            if (temp >= max) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }    
        }
        return max;
     }
}
