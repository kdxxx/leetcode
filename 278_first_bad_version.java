/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        while(isBadVersion(n)) {
            n = n -1;
        }   
        // when we got out of the while loop, the version is good. That is why we are increasing the value of n.
        return n+1;
    }
}
