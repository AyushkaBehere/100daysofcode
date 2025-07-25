class Solution {
    public int sumofDiv(int nums[], int div) {
        int sum = 0;
        for( int d = 0; d< nums.length; d++) {
            sum += Math.ceil((double)(nums[d]) / (double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length; //size of array.
        if(n > threshold) return -1;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++) {          
            maxi = Math.max(maxi, nums[i]);
        }
        int low = 1;
        int high = maxi;
        while(low<=high) {
            int mid = (low+high)/2;
            if(sumofDiv(nums, mid) <= threshold) {
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return low;
    }
}