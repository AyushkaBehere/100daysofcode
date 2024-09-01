// class Solution {
//     public int reverse(int x) {
//         int min = Integer.MIN_VALUE;
//         int max = Integer.MAX_VALUE;       
//         int sum = 0;
//         int rev = 0;        
        
//         while( x != 0){
//               sum =  x % 10;
//               rev = rev*10+sum;
//               x = x/10;
//         }
              
//         if( rev > max || rev < min ) {
//             return 0;
//         } else {
//             return rev;
//         }  
//     }     
// }
class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int temp;

        while (x != 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)reverse;
    }
}