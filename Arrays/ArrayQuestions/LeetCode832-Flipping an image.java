https://leetcode.com/problems/flipping-an-image/description/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for (int i=0; i<image.length; i++) {
            int start = 0;
            int end = image[0].length-1;
            while (start <= end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                start++;
                end--;
            }
        }

        for (int[] arr : image) {
            for (int i=0; i<image.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                }
                else {
                    arr[i] = 1;
                }
            }
        }
        
        
        return image;       
    }
}
