class Solution {
    public int findComplement(int num) {
        int shift=0,ans=0;
        while((num>>shift)>0)
        {
          if(((num>>shift)&1)==0)
          {
             ans=ans+(1<<shift);
          }
        // System.out.println("num is "+num+" shift is "+shift+"ans is "+ans);
          shift+=1;
        }
        return ans;
    }
}

// class Solution {
//     public static int findComplement(int num) {        
//       String a = Integer.toBinaryString(num);
    
//       String b = "";
//       for (int i = 0; i<a.length(); i++){    
//         if( a.charAt(i) == '0') {
//             b += '1';
//         } else {
//             b += '0';
//         }
//       }

//         return Integer.parseInt(b);
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//         System.out.println(findComplement(num));
//     }
// }