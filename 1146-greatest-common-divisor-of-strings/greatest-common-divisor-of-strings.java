class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        String concat1 = str1.concat(str2);
        String concat2 = str2.concat(str1);
        int x = str1.length();
        int y = str2.length(); 
        if( (concat1.equals(concat2)) == true) {      
              int z = findGCD(x, y);
              return (str1.substring(0, z));
          } else {
            return "";
          }
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    } 


    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("str1 : ");
        String str1 = sc.nextLine();
        System.out.println("str2 : ");
        String str2 = sc.nextLine();
        System.out.println(gcdOfStrings(str1, str2));
    }


}