class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while( low <= high) {
            mid = (low+high)/2;
            if(nums[mid] == target) {
                return mid;                
            }
            //left sorted
            if(nums[low] <= nums[mid] ) {
                if(nums[low] <= target && target <= nums[mid]) {
                    high = mid-1;
                } else {
                    low = mid + 1;
                }
            }

            else {
            //right sorted 
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid -1 ;
                }
            
            }
            
        }
         return -1;
    }
}