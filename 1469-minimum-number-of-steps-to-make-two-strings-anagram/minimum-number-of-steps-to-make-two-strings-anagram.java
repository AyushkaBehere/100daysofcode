// class Solution {
//     public int minSteps(String s, String t) {

//         char [] chars = s.tocharArray();
//         char []  abc = t.tocharArray();

//         Arrays.sort(chars);
//         Arrays.sort(abc); 



//     }

//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("s : ");
//         String s = sc.nextLine();
        
//         System.out.println("t : ");
//         String t = sc.nextLine();

//         System.out.println(minSteps(s,t));

//     } 
// }







import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static int minSteps(String s, String t) {
        if (s.length() != t.length()) {
            return -1; // Strings must be of the same length for anagrams
        }

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in string s
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Subtract the frequency of each character in string t
        // If a character is not present in t, or its frequency becomes negative, it needs to be replaced
        for (char c : t.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) - 1);
        }

        int steps = 0;

        // Count the total number of replacements needed
        for (int count : frequencyMap.values()) {
            steps += Math.abs(count);
        }

        // Each replacement involves changing one character, so divide by 2
        return steps / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("s : ");
        String s = sc.nextLine();

        System.out.println("t : ");
        String t = sc.nextLine();

        int result = minSteps(s, t);

        if (result != -1) {
            System.out.println("Minimum number of steps: " + result);
        } else {
            System.out.println("Strings must be of the same length for anagrams.");
        }
    }
}
