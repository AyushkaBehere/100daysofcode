class Solution {
    public static int findGCD(int[] nums) {
    Arrays.sort(nums);
    int div = 0;
    int n = nums.length;
    int min = nums[0];
    int max = nums[n-1];

     for(int i = 1; i<= min; i++){
            if( max % i ==0  && min % i == 0){
                div = i;
            }
    }
    return div;

    }
}





// class Solution {
//     public static int findGCD(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // int div = 0;
        // for(int i = 0; i< nums.length; i++){
            //  max = Math.max(max, nums[i]);
            //  min = Math.max(min ,nums[i]);
        // }
        // for(int i = 1; i<= min; i++){
        //     if( max % i ==0  && min % i == 0){
        //         div = i;
        //     }
        // }
        // return div;
//     }

// }