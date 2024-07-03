class Solution {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int posi[] = new int[n/2];
        int neg[] = new int [n/2];
        int index = 0;
        int idx = 0;
        for(int i = 0; i<n; i++) {
          if( nums[i] > 0) {
            posi[index] = nums[i];
            index++;
          } else if(nums[i] < 0 ) {
            neg[idx] = nums[i];
            idx++; 
          }
        }

        for(int i = 0; i<n; i++) {
            if( i % 2 == 0) {
                nums[i] = posi[i/2];
            } else if (i % 2 !=0) {
                nums[i] = neg[i/2];
            }
        }

        return nums;
    }
}