// class Solution {
//     public static int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int curr = 0;
        
//         for( int i= 0; i<nums.length; i++) {
//             curr += nums[i];
//             if(curr<0) {
//                 curr = 0;
//             }

//             max = Math.max(max, curr);
//         }
//         return max;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the range of array: ");
//         int range = sc.nextInt();

//         int inputarray[] = new int [range];
//         System.out.println("Enter the elements of array: ");
//         for(int i = 0; i<inputarray.length; i++) {
//            inputarray[i] = sc.nextInt();
//             System.out.println(inputarray[i]);
           
//         }
        
//         System.out.println(maxSubArray(inputarray));
//     }
// }

import java.util.Scanner;

public class Solution {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int curr = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }

        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array: ");
        int range = sc.nextInt();

        int inputarray[] = new int[range];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < inputarray.length; i++) {
            inputarray[i] = sc.nextInt(); // Read input values into the array
        }

        System.out.println(maxSubArray(inputarray));
    }
}
