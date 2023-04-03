https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String str1, String str2) {
        // Edge Cases:
        if (str1.length() != str2.length()) {
            return false;
        }

        if (str1 == null && str2 == null) {
            return true;
        }

        if (str1 == null || str2 == null) {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();

        // Add the Characters of str1 to the HashMap & count their frequency:
        for (int i=0; i<str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }
            else {
                map.put(str1.charAt(i), 1);
            }
        }
        
        // For every Character in str2 check if it exists in the HashMap,
        // if it exist with its frequency > 1 ie: it appears more than once, 
        // decrease its frequncy each time it matches, untill its frquency becomes 1
        // then remove the element completely from the HashMap.
        for (int i=0; i<str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                int frequency = map.get(str2.charAt(i));
                if (frequency > 1) {
                    map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
                }
                else {
                    map.remove(str2.charAt(i));
                }
            }
        }
        return map.isEmpty();
    }
}
