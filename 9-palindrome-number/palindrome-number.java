class Solution {
    public static boolean isPalindrome(int x) {
        // Convert integer to string
        String str = Integer.toString(x);

        // Use two pointers to compare characters from the start and end of the string
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Characters don't match, not a palindrome
            }
            i++;
            j--;
        }

        return true; // All characters match, it's a palindrome
    }

    public static void main(String[] args) {
        int num1 = 121;
        System.out.println(isPalindrome(num1)); // Output: true

        int num2 = -121;
        System.out.println(isPalindrome(num2)); // Output: false

        int num3 = 10;
        System.out.println(isPalindrome(num3)); // Output: false
    }
}
