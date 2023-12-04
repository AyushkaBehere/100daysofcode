class Solution {
    public static boolean isPalindrome(String s) {
         s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
       
        int n = s.length();

        for (int i = 0; i<s.length()/2; i++) {
            if ( s.charAt(i) != s.charAt(n-i-1) ) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      String s = sc.nextLine();

      System.out.println(isPalindrome(s));
    }
}