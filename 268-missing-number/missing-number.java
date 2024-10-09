class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int  a = 0;
        int sum = 0;
        for(int k = 0; k<=n; k++) {
            sum += k;
        }

        for(int i = 0; i<n; i++) {
            a += nums[i];         
        }

        return sum-a;
    }
}