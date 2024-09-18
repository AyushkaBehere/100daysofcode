class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int idx = 0;
        for(int i = 0; i< n-1; i++) {
            if(nums[i] == target) {
                idx = i;
            }
            if(nums[i] < target && target <= nums[i+1]) {
                idx = i+1;
            }
        }
        if(target > nums[n-1]) {
            idx = n;
        }

        return idx;
    }
}