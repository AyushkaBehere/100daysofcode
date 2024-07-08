class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int a = 0;
        int b = 0;
        for( int i = 0; i<n; i++) {
            if( i % 2 == 0) {
                a += Math.max(piles[i], piles[n-i-1]);
            } else{
                b += Math.min(piles[i], piles[n-i-1]);
            }
        }
        if( a > b) {
            return true;
        } else {
            return false;
        }
    }
}