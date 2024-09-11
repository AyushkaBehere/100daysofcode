class Solution {
    public int maxSubArray(int[] nums) {
        // int n = nums.length;        
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i<n; i++) {
        //     for(int j = i; j<n; j++){
        //         int[] arr = Arrays.copyOfRange(nums, i, j+1);
        //         int sum = 0;
        //         for(int k = 0; k<arr.length; k++) {
        //             sum +=arr[k];
        //         }
        //         max = Math.max(sum, max);
        //     }
        // }
        // return max;
        
        if(nums.length == 0) {
            return 0;
        }
         int max = nums[0];
        int curr = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }

        return max;
    }
}