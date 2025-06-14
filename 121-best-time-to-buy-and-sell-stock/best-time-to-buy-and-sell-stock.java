class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int mini = prices[0];
        for( int i = 0; i< n ; i++) {
            int cost = prices[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, prices[i]);
        }

        return profit;
    }
}


// class Solution {
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int profit = 0;
//         for( int i = 0; i<n-1; i++) {
//             for(int j = i+1; j<n; j++) {
//                 if( i < j ) {
//                     profit = Math.max(profit, prices[j] - prices[i]);
//                 }
//             }
//         }
//         return profit;
//     }
// }