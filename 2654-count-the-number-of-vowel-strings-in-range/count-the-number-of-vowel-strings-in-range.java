import java.util.Scanner;

class Solution {
    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];
            if ((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') &&
                (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'e' || s.charAt(s.length() - 1) == 'i' ||
                s.charAt(s.length() - 1) == 'o' || s.charAt(s.length() - 1) == 'u')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] words = new String[n];
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        System.out.println("Enter left");
        int left = sc.nextInt();
        System.out.println("Enter right");
        int right = sc.nextInt();

        System.out.println(vowelStrings(words, left, right));
    }
}