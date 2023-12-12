import java.util.Scanner;

class Solution {
    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = (nums[i] - 1) * (nums[j] - 1);
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array");
        int a = sc.nextInt();
        int[] b = new int[a];

        System.out.println("Enter array elements:");
        for (int x = 0; x < b.length; x++) {
            b[x] = sc.nextInt();
        }

        int result = maxProduct(b);
        System.out.println("Max Product of 2 elements: " + result);
    }
}