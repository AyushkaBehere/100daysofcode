class Solution {
    public static boolean checkPerfectNumber(int num) {
      int sum = 0; 
      for(int i = 1; i<num; i++){
        if( num % i == 0 ){
            sum = sum+i;            
        }     
    }
       if( sum == num) {
          return true;
        }

        return false;    
        
    }
}
















  //int sum = 0;
    //     for (int i = 1; i<= num/2; i++) {
    //         if (num % i == 0) {
    //             sum = sum + i;
    //         }
    //     }
    //     if (sum == num) {
    //         return true;
    //     }
    //     return false;
    // }

    // public static void main (String args[]) {
    //     Scanner sc = new Scanner (System.in);
    //     System.out.println("enter your no. : ");
    //     int a = sc.nextInt();
    //     System.out.println(checkPerfectNumber(a));
    // }