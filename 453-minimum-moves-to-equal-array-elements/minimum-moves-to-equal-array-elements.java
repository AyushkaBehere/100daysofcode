class Solution {
    public static int minMoves(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++) {
           moves += nums[i] - nums[0];
        }
        return moves;
    }
}