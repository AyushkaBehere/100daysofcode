import java.util.Scanner;

public class Solution {
    public static int smallestEvenMultiple(int n) {
        // LCM of two numbers a and b is given by (a * b) / GCD(a, b)
        // Since we are finding the LCM of 2 and n, the formula simplifies to (2 * n) / GCD(2, n)
        int lcm = (2 * n) / gcd(2, n);
        return lcm;
    }

    // Recursive method to calculate the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer n: ");
        int n = sc.nextInt();

        int result = smallestEvenMultiple(n);

        System.out.println("The smallest multiple of both 2 and " + n + " is: " + result);
    }
}
