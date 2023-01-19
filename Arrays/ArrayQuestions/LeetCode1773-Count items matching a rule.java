https://leetcode.com/problems/count-items-matching-a-rule/description/
class Solution {
    public int countMatches(List<List<String>> list, String ruleKey, String ruleValue) {
        int n = list.size();
        int ans = 0;
        for (int i=0; i<n; i++) {
            if (ruleKey.equals("type") && list.get(i).get(0).equals(ruleValue)) {
                ans++;
            }

            if (ruleKey.equals("color") && list.get(i).get(1).equals(ruleValue)) {
                ans++;
            }

            if (ruleKey.equals("name") && list.get(i).get(2).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}
