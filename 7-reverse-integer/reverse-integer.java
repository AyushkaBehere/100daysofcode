class Solution {
    public static int reverse(int x) {
        int dig = 0;
        long sum = 0;       
        while( x != 0 ){
            dig = x % 10; 
            sum = sum *10 + dig;
            x = x/10;
        }

        if( sum > Integer.MAX_VALUE || Integer.MIN_VALUE > sum ) {
                sum = 0;
        } 
       
        return (int)sum;     
    }
}
