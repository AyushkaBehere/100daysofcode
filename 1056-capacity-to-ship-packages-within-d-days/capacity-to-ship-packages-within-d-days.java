class Solution {
    public static int findDays(int[] weights, int cap) {
        int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int sum = Arrays.stream(weights).sum();
        int maxi = Integer.MIN_VALUE;
        int n = weights.length;
        for(int i = 0; i< n ; i++) {
            maxi = Math.max(maxi, weights[i]);
        }
        int low = maxi, high = sum;
        while(low<=high) {
            int mid = (low+high)/2;
            int noOfDays = findDays(weights,mid);
            if( noOfDays <= days) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
         return low;
    }
   
}