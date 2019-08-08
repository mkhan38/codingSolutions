class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int n = x;
        if (x < 0)
            return false;
        else {
            while(n != 0) {
                reverse *= 10;
                reverse += (n%10);
                n /= 10;
            }
            if (reverse == x)
                return true;
            else
                return false;
        }
        
    }
}
