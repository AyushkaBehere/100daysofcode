class Solution {
    public boolean isPalindrome(int x) {
        int a = 0;
        int y = x;
        while( x > 0 ) {
            int b = x%10;
            a = a*10 + b;
            x=x/10;
        }
        if(a == y) {
            return true;
        }
        return false;
    }
}