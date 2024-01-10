import java.util.Scanner;

public class Solution {  

    public static int compress(char[] chars) {
        // if (chars == null || chars.length == 0) {
        //     return 0;
        // }
        int writeIdx = 0; // index to write compressed characters
        int readIdx = 0;  // index to read characters from the original array

        while (readIdx < chars.length) {
            char currentChar = chars[readIdx];
            int count = 0;

            // Count consecutive repeating characters
            while (readIdx < chars.length && chars[readIdx] == currentChar) {
                readIdx++;
                count++;
            }

            chars[writeIdx++] = currentChar;

            // Append count if greater than 1
            if (count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                for (char digit : countChars) {
                    chars[writeIdx++] = digit;
                }
            }
        }

        return writeIdx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the characters (separated by spaces):");
        String inputString = scanner.nextLine();
        char[] inputChars = inputString.toCharArray();

        // Compressing the array
        int resultLength = compress(inputChars);

        // Output: ['a', '2', 'b', '2', 'c', '3']
        for (int i = 0; i < resultLength; i++) {
            System.out.print(inputChars[i] + " ");
        }
    }
}