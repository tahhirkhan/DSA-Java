https://leetcode.com/problems/add-to-array-form-of-integer/description/
class Solution {
    public List<Integer> addToArrayForm(int[] num, int n) {
        List list = new ArrayList<>();
        int temp = 0;
        for (int i=num.length-1; i>=0; i--) {
            if (i == 0) {
                n += num[i];
                while (n > 0) {
                    list.add(n%10);
                    n /= 10;
                }
                break;
            }
            int ans = 0;
            n += num[i];
            ans = n % 10;
            list.add(ans);
            n /= 10;
            temp = n;
        }
        Collections.reverse(list);
        return list;
    }
} 
