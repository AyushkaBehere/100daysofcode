class Solution {
    public static int missingNumber(int[] nums) {
        int a = 0;
        int b = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            a = nums[i] + a;          
        }
        for (int j = 0; j<=n; j++){
            b = j + b;
        }
        return b-a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int range = sc.nextInt();
        int[] arr = new int[range];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }

}