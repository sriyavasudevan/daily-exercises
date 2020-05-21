class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int count = 0;
        if(prices.length == 1) {
            return 0;
        }
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i-1] > prices[i]) {
                continue;
            } else {
                profit += prices[i] - prices[i-1];
                count++;
            }
        }
        
        if(count == prices.length - 1) {
            profit = prices[prices.length - 1] - prices[0];
        }
        return profit;
    }
}