class Solution {
    public int maxProfit(int k, int[] prices) {
         int n = prices.length;

        Integer[][][] dp = new Integer[n][2][k+1];

        return helper(prices , 0 , 1 , k ,dp); 
    }


    public int helper(int[] prices , int i , int buy , int capacity , Integer[][][] dp){
        if(capacity==0){
            return 0;
        }

        if(i==prices.length){
            return 0;
        }

        if(dp[i][buy][capacity]!=null){
            return dp[i][buy][capacity];
        }

        int profit = 0;

        if(buy==1){
            int buykaro = -prices[i] + helper(prices , i+1 , 0 , capacity ,dp); // capacity will be same bc i have not sell it till now

            int skip = helper(prices , i+1 ,1 ,capacity ,dp);

            profit = Math.max(buykaro , skip); 
        }

        else{
            int sell  = prices[i] + helper(prices , i+1 , 1 , capacity-1 ,dp);

            int skip = helper(prices , i+1 , 0 , capacity,dp);

            profit = Math.max(sell ,skip);
        }

        return dp[i][buy][capacity] = profit;


    }
}