class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;   
        Arrays.sort(nums);
        if( n == 1) {
            return nums[0];
        }
        if( n == 3 && nums[0] != nums[1] ) {
          return nums[0];
        }
        if( nums[n-1] != nums [n-2]) {
            return nums[n-1];
        }
        int unique = 0;
            int left = 0;
            int right = 1;
            while(left<right && left < n && right <n) {
                if(nums[left] != nums[right]) {
                unique =  nums[left];
                break;
                } else {
                    left = left+2;
                    right= right+2; 
                }        
            }      
        return unique;      
    }
}