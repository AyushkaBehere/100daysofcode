class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        if(n == 1) {
            return arr;
        }

        Arrays.sort(nums);
        for(int i = 0; i<n-1; i++) {
            if(nums[i] == nums [i+1]) {
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}