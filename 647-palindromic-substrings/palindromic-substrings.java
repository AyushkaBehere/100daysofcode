class Solution {
    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0; 

        for(int i = 0; i <= n-2; i++) {
            for(int j = i+2; j <= n; j++){
                String substr = s.substring(i, j);
                if(isPalindrome(substr) == true) {
                    count ++;
                }
            }            
        }
        int totalCount = count + n;
        return totalCount;       
    }

    private static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    } 

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        System.out.println(countSubstrings(str));
    }
}









// import java.util.Scanner;

// class Solution {
//     public static int countSubstrings(String s) {
//         int n = s.length();
//         int count = 0;

        
//         for (int i = 0; i <= n-2; i++) {
//             for (int j = i+2; j <= n; j++) {
//                 String substr = s.substring(i, j);
//                 if (isPalindrome(substr)) {
//                     count++;
//                 }
//             }
//         }

//         return n+count;
//     }

  

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String str = sc.nextLine();
//         System.out.println("Number of palindromic substrings: " + countSubstrings(str));
//     }
// }