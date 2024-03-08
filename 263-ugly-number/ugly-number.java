// class Solution {
//     public static boolean isUgly(int n) {
//        for ( int i = 2; i <= n; i++) {
//            if ( n % i == 0 &&  i!=2 && i!=3 && i!=5  ) {
//                return false;
//            }
//        }
//        return true;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter crow: ");
//         int N = sc.nextInt();

//         System.out.println(isUgly(N));
//     }
// }

class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        for(int i = 2; i<6; i++){  //then
            while(n%i==0){
                n = n/i;          //ji
            }
        }
        return n==1;
    }
}