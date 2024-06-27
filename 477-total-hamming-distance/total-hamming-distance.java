class Solution {
    public static int totalHammingDistance(int[] nums) {
        int HamDist = 0;
        for(int i =0; i< nums.length-1; i++){
            for( int j = i+1; j < nums.length; j++){
                HamDist += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return HamDist;

    }
}