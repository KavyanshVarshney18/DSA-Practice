class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        Integer[][] dp = new Integer[n][2];   //n->days , 2-> take , nottake max
        return helper(prices , 1 , 0 ,dp , fee);   //1 means i can buy initially , 0 is the index
    }

    public int helper(int[] prices , int buy , int i,Integer[][] dp ,int fee){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy]!=null) {
            return dp[i][buy];
        }

        int profit =0;
        if(buy==1){
            int buykaro = -prices[i] + helper(prices , 0 ,i+1 ,dp,fee);
            int skipkaro = helper(prices , 1,i+1 ,dp ,fee);
            profit = Math.max(buykaro , skipkaro);
        }

        else{
            int sellkaro = prices[i]-fee + helper(prices , 1 , i+1 ,dp ,fee);
            int skipkaro = helper(prices , 0,i+1 ,dp ,fee);
            profit = Math.max(sellkaro , skipkaro);
        }

        return dp[i][buy] = profit;
}
}