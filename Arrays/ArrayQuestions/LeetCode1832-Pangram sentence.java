https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
class Solution {
    public boolean checkIfPangram(String sentence) {
        // for (int i=0; i<26; i++) {
        //     char currChar = (char)('a'+i);
        //     if (sentence.indexOf(currChar) == -1) {
        //         return false;
        //     }
        // }
        // return true;

        boolean[] ans = new boolean[26];
        for (char currChar : sentence.toCharArray()) {
            ans[currChar - 'a'] = true;
        }

        for (boolean status : ans) {
            if (!status) {
                return false;
            }
        }
        return true;
    }
}
