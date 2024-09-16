// class Solution {
//     public boolean isHappy(int n) {
//         int sum = 0;
//         int a = 0;
//         while (n > 0) {
//             a = n % 10;
//             sum += (a*a);
//             n = n/10;
//         }
//             if( sum == 1) {
//                 return true;
//             } 
//         return false;
//     }
// }

// class Solution {
//     public boolean isHappy(int n) {
//         Set<Integer> visit = new HashSet<>();        
//         while (!visit.contains(n)) {
//             visit.add(n);
//             n = getNextNumber(n);
//             if (n == 1) {
//                 return true;
//             }
//         }
        
//         return false;
//     }

//     private int getNextNumber(int n) {
//         int output = 0;
        
//         while (n > 0) {
//             int digit = n % 10;
//             output += digit * digit;
//             n = n / 10;
//         }
        
//         return output;
//     }
//}


class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        if (n == 1) {
            return true;
        } else if (n==4) {
            return false;
        } else {
            while (n > 0) {
                sum = sum + (int) Math.pow(n % 10, 2);
                n = n / 10;
            }
            return isHappy(sum);
        }
    }
}