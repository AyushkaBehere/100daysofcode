
import java.util.Scanner;

public class Solution {
    public static String largestGoodInteger(String num) {
        int x = -1;
        for (int i = 0; i <= num.length() - 3; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                int a = Integer.parseInt(num.substring(i, i + 3));
                if (a > x) {
                    x = a;
                }
            }
        }
        if (x == -1) {
            return ""; 
        }
        else if(x==0)
        {
            return "000";
        }
        else {
            return String.valueOf(x);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String ami = sc.nextLine();
        System.out.println(largestGoodInteger(ami));
    }
}
