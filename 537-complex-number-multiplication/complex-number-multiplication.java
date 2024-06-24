class Solution {
    public static String complexNumberMultiply(String num1, String num2) {

        int real1 = Integer.parseInt(num1.substring(0,num1.indexOf('+')));
        int real2 = Integer.parseInt(num2.substring(0,num2.indexOf('+')));

        int real3 = Integer.parseInt(num1.substring(num1.indexOf('+') + 1, num1.indexOf('i')));
        int real4 = Integer.parseInt(num2.substring(num2.indexOf('+') + 1, num2.indexOf('i')));

        return (real1*real2-real3*real4) + "+" + (real2*real3+real1 *real4) + "i";
    }
}