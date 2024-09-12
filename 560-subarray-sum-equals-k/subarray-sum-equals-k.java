// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;            
//         int count = 0;
//         for(int i = 0; i<n; i++) {
//             for( int j = i+1; j<=n ;j++) {
//              int arr[] = Arrays.copyOfRange(nums, i, j);
//              int sum = 0; 
//                 for(int x = 0; x<arr.length; x++) {
//                     sum += arr[x];
//                     if(sum == k) {
//                         count++;
//                     }
//                 }      
//             }       
//         }
//         return count;
//     }
// }

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;            
        int count = 0;       
        
        for(int i = 0; i < n; i++) {
            int sum = 0;           
            for(int j = i; j < n; j++) {
                sum += nums[j];  
                if(sum == k) {
                    count++;
                }
            }
        }        
        return count;
    }
}