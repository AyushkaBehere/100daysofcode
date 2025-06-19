class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(nums[mid] >= target) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}











// int idx = 0;
//         for(int i = 0; i< n-1; i++) {
//             if(nums[i] == target) {
//                 idx = i;
//             }
//             if(nums[i] < target && target <= nums[i+1]) {
//                 idx = i+1;
//             }
//         }
//         if(target > nums[n-1]) {
//             idx = n;
//         }

//         return idx;