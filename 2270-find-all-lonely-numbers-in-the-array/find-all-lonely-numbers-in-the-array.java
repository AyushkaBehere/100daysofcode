class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
    
        if( n == 1 || nums[0] != nums[1] && nums[1] - nums[0] > 1){
            arr.add(nums[0]);
        }
        if( n > 1 && nums[n-1] != nums[n-2] && nums[n-1]-nums[n-2] > 1) {
            arr.add(nums[n-1]);
        }
        for( int i = 1; i<n-1; i++ ) {
            if( nums[i] != nums [i+1] && (nums[i+1]-nums[i] > 1) && (nums[i]- nums[i-1] > 1) && nums[i] != nums [i-1]) {
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}