// class Solution {
//     public static int thirdMax(int[] nums) {
//         Arrays.sort(nums);
//         if( nums.length < 3) {
//            return(nums[nums.length-1]);
//         }
//         else if (nums.length > 3 && nums[nums.length-2] == nums[nums.length-3] ) {
//            return nums[nums.length-4];
//         }        
        
//         return nums[nums.length-3];
        
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int range = sc.nextInt();
//         int nums[] = new int[range];
//         for (int i = 0; i<nums.length; i++) {
//             nums[i] = sc.nextInt();
//         }
//         System.out.println(thirdMax(nums));
//     }
// }

class Solution {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinctCount = 1;
        int n = nums.length;
        
        // Traverse the sorted array from end to start
        for (int i = n - 1; i > 0; i--) {
            // Check if the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                distinctCount++;
            }
            
            // If we have found the third distinct maximum
            if (distinctCount == 3) {
                return nums[i - 1];
            }
        }
        
        // If there are less than three distinct maximums, return the maximum number
        return nums[n - 1];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int nums[] = new int[range];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(thirdMax(nums));
    }
}
