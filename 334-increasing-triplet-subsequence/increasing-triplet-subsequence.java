class Solution {
    public boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            
            if (n <= max1) {
                max1 = n;
            } else if (n <= max2) {
                max2 = n;
            } else {
                return true;
            }
        }
        return false;
        // for(int i = 0; i< nums.length-3; i++) {
        //     if ( nums [i] < nums[i+1] && nums[i+1] < nums[i+2]) {
        //         return true;
        //     } else if (nums [i] < nums[i+1] && nums[i+1] < nums[i+3]) {
        //         return true;
        //     } else if ( nums [i] < nums[i+2] && nums[i+2] < nums[i+3] ) {
        //         return true;
        //     }
        // }
        // return false;
    }
}