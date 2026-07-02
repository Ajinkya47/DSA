class Solution {
    public int maxProfit(int[] prices) {
    //     int n = prices.length;
    //     int maxprofit = 0;
        
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             int profit = prices[j] - prices[i];
    //             maxprofit = Math.max(maxprofit, profit);
    //         }
    //     }
    //     return maxprofit;  // Return 0 if no profit possible
    // }


        int minPrice=Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;

        for(int i =0;i<n;i++){

            if(prices[i]<minPrice){
                minPrice=prices[i];
            }

            

            int profit = prices[i]-minPrice;

            if(profit>maxProfit){
                maxProfit=profit;
            }
        }

            return maxProfit;


        }

        

}