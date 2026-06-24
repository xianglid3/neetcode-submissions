class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int maxProfit = 0;

        for(int buy = 0; buy < prices.length; buy++){

            for(int sell = buy + 1; sell < prices.length; sell++){
                
                profit = prices[sell] - prices[buy];
                
                if(profit > maxProfit){
                    maxProfit = profit;
                }


            }
        }

        return maxProfit;

    }
}
