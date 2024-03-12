class Solution {
    public static int maximumProduct(int[] nums) {
         Arrays.sort(nums);
      int product = Math.max(nums[0] * nums[1] * nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3] );
      return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter range");
        int range = sc.nextInt();
        int arr[] = new int [range];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumProduct(arr));
    }
}