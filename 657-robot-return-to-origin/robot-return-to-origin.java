class Solution {
    public static boolean judgeCircle(String moves) {
       char [] Array = moves.toCharArray();
       int count1= 0;
       int count2= 0;
       int count3= 0;
       int count4= 0;
       for(int i = 0; i<Array.length; i++){
        if( Array[i] == 'L'){
            count1++;
        } else if( Array[i] == 'R'){
            count2++;
        } else if( Array[i] == 'U'){
            count3++;
        } else if( Array[i] == 'D'){
            count4++;
        }
      }

      if( count1 == count2 && count3 == count4){
        return true;
      }
      return false;
       
    }
}