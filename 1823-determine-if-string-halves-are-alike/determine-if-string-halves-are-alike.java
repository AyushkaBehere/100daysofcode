class Solution {
    public static boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        int count= 0;
        int sum = 0;
        for(int i = 0; i<str.length()/2; i++){
           if( str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'||
           str.charAt(i) == 'o'||str.charAt(i) == 'u') {
            count ++;
           }
        }
        for(int i = str.length()/2; i<str.length(); i++){
              if( str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'||
           str.charAt(i) == 'o'||str.charAt(i) == 'u') {
            sum ++;
           }
        }

        if(sum==count){
            return true;
        }

        return false;

    }
}