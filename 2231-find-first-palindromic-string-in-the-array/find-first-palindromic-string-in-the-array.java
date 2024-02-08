// class Solution {
//     public static String firstPalindrome(String[] words) {
//         int x = words.length;

//         for(int i = 0 ; i<x; i++) {
//             String y = words[i];
//             int b = y.length();
//             for(int j = 0 ; j<b/2; j++) {
//                 if (y.charAt(j) == y.charAt( b -j -1)){
//                     return y; 
                
//                 }
//             }
//         }
//         return "";
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the no. of words: ");
//         int a = sc.nextInt();

//         System.out.print("Enter the Strings: ");
//         String ArrayStr [] = new String [a];
//         for(int i = 0; i < ArrayStr.length; i++) {
//             ArrayStr[i] = sc.nextLine();
//         }
//         System.out.println(firstPalindrome(ArrayStr));      
//     }
// }


import java.util.Scanner;

class Solution {
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
    
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int a = sc.nextInt();
        sc.nextLine(); // consume newline left by nextInt()

        System.out.println("Enter the Strings: ");
        String ArrayStr[] = new String[a];
        for (int i = 0; i < ArrayStr.length; i++) {
            ArrayStr[i] = sc.nextLine();
        }
        System.out.println(firstPalindrome(ArrayStr));      
    }
}
