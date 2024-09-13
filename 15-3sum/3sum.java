// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> arr = new ArrayList<>(); 
//         int n = nums.length;
//         Arrays.sort(nums);
        
//         for (int i = 0; i < n - 2; i++) {
//             // Skip duplicates for the first element
//             if (i > 0 && nums[i] == nums[i - 1]) continue;

//             for (int j = i + 1; j < n - 1; j++) {
//                 // Skip duplicates for the second element
//                 if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
//                 for (int k = j + 1; k < n; k++) {
//                     // Skip duplicates for the third element
//                     if (k > j + 1 && nums[k] == nums[k - 1]) continue;

//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         // Add triplet as a list
//                         arr.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     }
//                 }
//             }
//         }
//         return arr; // Return a list of lists of integers
//     }
// }


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); 
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) { // Loop through the array
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) { // Two-pointer approach
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) { // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers after storing the triplet
                    left++;
                    right--;
                } else if (sum < 0) { // If sum is less than 0, increment left pointer
                    left++;
                } else { // If sum is greater than 0, decrement right pointer
                    right--;
                }
            }
        }
        return result; // Return the final list of triplets
    }
}
