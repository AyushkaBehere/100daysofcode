import java.util.*;
class Solution {
   
   
    public String largestOddNumber(String num) {
        int n = num.length();
        int end = -1;

        for (int i = n - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 == 1) {
                end = i;
                break;
            }
        }

        if (end == -1) {
            return ""; // No odd digits found
        }

        return num.substring(0, end + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String num1 = "52";
        System.out.println(solution.largestOddNumber(num1)); // Output: "5"

        // Example 2
        String num2 = "4206";
        System.out.println(solution.largestOddNumber(num2)); // Output: ""

        // Example 3
        String num3 = "35427";
        System.out.println(solution.largestOddNumber(num3)); // Output: "35427"
    }
}


// import java.util.Scanner;
// public class StringManipulation {
//     public static String largestOddNumber(String num) {
//         int z = 0;
//         int n = num.length();
//         int x = Integer.parseInt(num);

//         if (x % 2 == 0) {
//             for (int i = 0; i < n; i++) {
//                 int c = Character.getNumericValue(num.charAt(i));
//                 if (c % 2 == 1) {
//                     z = Math.max(c, z);
//                 }
//           
//             }
//             return Integer.toString(z);
//         } 
        
//         else 
//         {
//             return num; 
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string number:");
//         String a = sc.nextLine();
//         System.out.println(largestOddNumber(a));
//     }
// }