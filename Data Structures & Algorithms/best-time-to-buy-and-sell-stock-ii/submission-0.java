class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit=0;
        int buyThing=prices[0];
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-buyThing;
            if(profit>=0){
                totalProfit+=profit;
                buyThing=prices[i];
            }
            buyThing=Math.min(buyThing,prices[i]);
        }

        return totalProfit;
    }
}