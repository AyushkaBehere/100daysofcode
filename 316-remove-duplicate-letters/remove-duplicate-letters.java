class Solution {
    public String removeDuplicateLetters(String s) {
       HashMap<Character, Integer> lastOccurrence = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26]; // Assuming only lowercase letters are in the input

        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!visited[c - 'a']) {
                while (!stack.isEmpty() && stack.peek() > c && lastOccurrence.get(stack.peek()) > i) {
                    visited[stack.pop() - 'a'] = false;
                }

                stack.push(c);
                visited[c - 'a'] = true;
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character character : stack) {
            result.append(character);
        }

        return result.toString();
        
    }
}
 
// public static String removeDuplicateLetters(String s, int idx, StringBuilder newStr, boolean map[]) {
//         if (idx == s.length()) {
//            return newStr.toString();            
//         }
//        char currChar = s.charAt(idx);
//         if (map[currChar - 'a'] == true) {
//             // duplicate
//            return removeDuplicateLetters(s, idx + 1, newStr, map);
//         } else {
//             map[currChar - 'a'] = true;
//            return removeDuplicateLetters(s, idx + 1, newStr.append(currChar), map);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner (System.in);
//         String s = sc.nextLine();
//        StringBuilder result = removeDuplicateLetters(s, 0, new StringBuilder(""), new boolean[26]);
//         System.out.println(result.toString());
//     }

