class Solution {
    public static int[] runningSum(int[] nums) {
        int result[] = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}