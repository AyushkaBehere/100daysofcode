class Solution {
    public boolean isAnagram(String s, String t) {
     char ch[] = s.toCharArray();
     char sh []= t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(sh);

        if(ch.length != sh.length) {
            return false;
        }
         return Arrays.equals(ch, sh);
        // for(int i = 0; i<ch.length; i++) {
        //     for(int j = i; j<sh.length; j++) {
        //         if(ch[i] != sh[j]) {
        //             return false;
        //         }
        //         break;
        //     }
        // }
        // return true;
    }
}