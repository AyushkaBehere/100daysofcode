import java.util.Scanner;

public class Solution {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int x = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j--) - '0' : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        String num1 = sc.nextLine();
        System.out.println("Enter num2:");
        String num2 = sc.nextLine();

        String sum = addStrings(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
