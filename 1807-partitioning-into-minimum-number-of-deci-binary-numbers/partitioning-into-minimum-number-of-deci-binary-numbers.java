class Solution {
    public static int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = Character.getNumericValue(n.charAt(i));
            if (digit > max) {
                max = digit;
            }
        }
        return max;
    }
}