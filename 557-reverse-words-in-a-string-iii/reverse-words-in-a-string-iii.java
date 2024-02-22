class Solution {
    public String reverseWords(String s) {

        char[] chars = s.toCharArray();
        int start = 0;
        int wordLength = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == ' ') {
                reverse(chars, start, wordLength);
                start = i + 1;
                wordLength = -1;
            }

            wordLength++;
        }

        reverse(chars, start, wordLength);

        return String.valueOf(chars);
    }

    private void reverse(char[] chars, int start, int wordLength) {

        int end = start + wordLength - 1;
        while (start < end) {
            swap(chars, start++, end--);
        }
    }

    private void swap(char[] chars, int idx1, int idx2) {

        char temp = chars[idx1];
        chars[idx1] = chars[idx2];
        chars[idx2] = temp;
    }
}