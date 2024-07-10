class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList <String> str = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i<n; i++){
            if( patMatch( words[i],pattern) == true ) {
                str.add(words[i]);
            }
        }
        return str;
    }

    public static boolean patMatch (String a, String pattern) {
        for(int i = 0; i<a.length(); i++) {
            if( a.indexOf(a.charAt(i)) != pattern.indexOf(pattern.charAt(i)) ) {
                return false;
            }
        }
        return true;
    }
}