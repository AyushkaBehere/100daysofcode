class Solution {
    public boolean isPalindrome(String s) {        
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        int n = str.length();
        if(str.equals(" ")) {
             return true;
        }
        for(int i = 0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}