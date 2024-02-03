class Solution {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n<0) {
            return false;
        }
        while ( n > 1 ) {
            if(n % 2 == 0 ) {
              n =  n/2; 
            }
             else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        System.out.println(isPowerOfTwo(a));
    }
}