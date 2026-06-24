class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int maxProfit = 0;
        int min_buy = prices[0];

        for(int buy = 1; buy < prices.length; buy++){
            profit = prices[buy] - min_buy;
            if(profit > maxProfit){
                maxProfit = profit;
            }

            if(prices[buy] < min_buy){
                min_buy = prices[buy];
            }

        }      

        return maxProfit;
    }

}
