class Solution {
    public static int[] minOperations(String boxes) {
        int len = boxes.length();
        int arr[] = new int [len];
        for(int i = 0; i<len; i++){
            for(int j = 0; j<len; j++){
               if( i!=j && boxes.charAt(j) == '1' ) {
                    arr[i] += Math.abs(j - i);
               }
            }
        }
        return arr;
    }
}