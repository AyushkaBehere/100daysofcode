class Solution {
    public static int balancedStringSplit(String s) {
        int len = s.length();
        int count = 0;
        int a = 0;
        for(int i = 0; i<len; i++){
           if(s.charAt(i) == 'R') {
            count++;
           } else {
            count--;
           }
           if(count == 0) {
            a++;
           }
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(balancedStringSplit(s));
    }

}