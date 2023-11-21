class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j = 0;
        for(int i = 0; i<nums.length-1; i++){
             if(nums[i] != nums[i+1]) {
                nums[j] = nums[i];
                j++;
             } 
        }       
        nums[j] = nums[nums.length-1];
        for(int k=0; k<=j; k++){
            System.out.print(nums[k]);
        }
           return j+1;    
    }

     
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the range of array : ");
        int range = sc.nextInt();

        int Inputarray[] = new int [range];
        System.out.println("Enter the array: ");        
        for(int i=0; i<Inputarray.length; i++) {
            Inputarray[i] = sc.nextInt();
        }
    }

}