class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String s = strs[0];
        String st = strs[n-1];
        int i = 0;
        for( i = 0; i<s.length() && i< st.length(); i++) {
            if(s.charAt(i) != st.charAt(i)) {
                break;
            }
        }
        return s.substring(0,i);
    }
}