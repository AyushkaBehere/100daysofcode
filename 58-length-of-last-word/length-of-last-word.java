class Solution {
    public static int lengthOfLastWord(String s) {
        
        if (s.length() == 0) {
            return 0;
        }
        String [] ayu = s.split(" ");  //Split function
        return ayu[ayu.length-1].length(); 
        // String[index no.].length    --->length of the word at the index number of the string.
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        System.out.println(lengthOfLastWord(str));
    }
}