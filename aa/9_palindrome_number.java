class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverse = 0;
        int remainder, first_value = x;
        while(x != 0){
            remainder = x % 10;
            reverse = reverse*10 + remainder;
            x = x/10;
        }
        return first_value == reverse;
    }
}
