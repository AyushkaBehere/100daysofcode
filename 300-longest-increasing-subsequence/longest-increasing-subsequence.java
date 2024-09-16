// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int count = 1;
//         for( int i = 0; i<n-1; i++) {
//             if(nums[i] == nums[i+1]) {
//                 count = 1;
//             }
//             else if(nums[i] > nums[i+1]) {
//                 continue;
//             }           
//             else if(nums[i] < nums[i+1]) {
//                 count++;
//             }
//         }
//         return count;

//     }
// }

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxCount = 1;  // To store the length of the longest increasing subsequence

        // Initialize dp array, each element is a subsequence of length 1 by default
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // For each element, look at previous elements to build the longest subsequence
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxCount = Math.max(maxCount, dp[i]);  // Update max LIS length
        }

        return maxCount;
    }
}
