// class Solution {
//     public void reverseString(char[] s) {
//         int n = s.length;
//         for(int i = n-1; i> n/2; i--){
//             char ch = s[i]; 
//             s[i] = s[n-i-1];
//             s[n-i-1] = ch;
//         }
//     }
// }
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char ch  = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;j--;
        }
    }
}