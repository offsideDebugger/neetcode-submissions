class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int currentBuy=prices[0];
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-currentBuy;
            maxProfit=Math.max(profit,maxProfit);
            currentBuy=Math.min(currentBuy,prices[i]);
        }

        return maxProfit;
    }
}
