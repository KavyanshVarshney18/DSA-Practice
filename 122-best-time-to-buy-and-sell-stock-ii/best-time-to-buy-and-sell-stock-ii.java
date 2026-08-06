class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        Integer[][] dp = new Integer[n][2];
        return helper(prices , 1 , 0 ,dp);  //1 means i can buy initially , 0 is the index
    }


    public int helper(int[] prices , int buy , int i,Integer[][] dp ){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy]!=null) {
            return dp[i][buy];
        }

        int profit =0;
        if(buy==1){
            int buykaro = -prices[i] + helper(prices , 0 ,i+1 ,dp);
            int skipkaro = helper(prices , 1,i+1 ,dp);
            profit = Math.max(buykaro , skipkaro);
        }

        else{
            int sellkaro = prices[i] + helper(prices , 1 , i+1 ,dp);
            int skipkaro = helper(prices , 0,i+1 ,dp);
            profit = Math.max(sellkaro , skipkaro);
        }
        return dp[i][buy] = profit;
    }
}