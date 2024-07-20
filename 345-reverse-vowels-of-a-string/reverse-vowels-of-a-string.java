class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] str = s.toCharArray();  // Convert string to char array
        int i = 0, j = n - 1;

        while (i < j) {
            // Move i to the next vowel
            while (i < j && !isVowel(str[i])) {
                i++;
            }
            // Move j to the previous vowel
            while (i < j && !isVowel(str[j])) {
                j--;
            }
            // Swap vowels
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str); 
    }
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}