https://leetcode.com/problems/first-bad-version/description/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int version = start + (end-start) / 2;
        while (start <= end) {
            if (isBadVersion(version)) {
                if (version > 1 && isBadVersion(version-1)) {
                    end = version-1;
                }
                else {
                    break;
                }
            }
            else {
                start = version + 1;
            }
            version = start + (end-start) / 2;
        }
        return version;
    }
}
