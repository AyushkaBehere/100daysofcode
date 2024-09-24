class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = 0;
        int a = 0;
        int count = 1;
        if( n==1) {
            return nums[0];
        }
        for(int i = 0; i<n-1; i++) {
            if (nums[i] == nums[i+1]){
                count++;
                max = Math.max(count, max);
                if(max > (n/2)) {
                    a = nums[i];
                    break;
                }
            }
        }
        return a;        
    }
}