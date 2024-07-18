class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int high = 0;
        int max = 0;
        for( int i = 0; i<n; i++){
           high += gain[i];
           max = Math.max(max, high );
        }
        return max;
    }
}