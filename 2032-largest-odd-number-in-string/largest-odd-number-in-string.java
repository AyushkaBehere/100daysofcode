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