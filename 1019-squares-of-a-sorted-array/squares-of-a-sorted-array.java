class Solution {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr [] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i]*nums[i];
        }
      Arrays.sort(arr);  
      return arr;
    }

    public static void main(String args[]) {
         Scanner sc = new Scanner (System.in);
         int range = sc.nextInt();
         int nums[]= new int [range];
         for (int i =0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(sortedSquares(nums));
    }
}