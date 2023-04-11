https://leetcode.com/problems/valid-palindrome/

boolean isPalindrome(String str) {
      str = str.toLowerCase().replaceAll("[^0-9a-z]", "");
      int start = 0;
      int end = str.length()-1;
      int mid = str.length()/2;
      while (start <= mid && end >= mid) {
          char first = str.charAt(start);
          char last = str.charAt(end);
          if (first != last) {
              return false;
          }
          start++;
          end--;
      }
      return true;
}
