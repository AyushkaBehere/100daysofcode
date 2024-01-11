// class Solution {
//     public static boolean isAnagram(String s, String t) {
//         int count = 0;
//         for(int i = 0; i<s.length(); i++){
//             for(int j= 0; j<t.length(); j++) {
//                 if(s.charAt(i) == t.charAt(j)) {
//                     count++;
                    
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("s = ");
//         String s = sc.nextLine();
//         System.out.println("t = ");
//         String t = sc.nextLine();

//         System.out.println(isAnagram(s,t));

//     }
// }




import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Sort character arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Check if sorted arrays are equal
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("s = ");
        String s = sc.nextLine();
        System.out.println("t = ");
        String t = sc.nextLine();

        System.out.println(isAnagram(s, t));
    }
}
