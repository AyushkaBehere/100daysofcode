// class Solution {
//     public int rob(int[] nums) {
//         int sum = 0;
//         int add = 0; 
//         int n = nums.length;
//         for(int i = 0; i<n-2; i = i+2) {
//             int sum = 0;
//             for(int j = i+2; j<n; j = j+2) {
//             sum += nums[j] ;
//             }
//         }
//         if( sum == add) {
//             return sum;f
//         }
//         return Math.max(sum, add);
//     }
// }

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[n - 1];        
    }
}
