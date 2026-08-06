class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;

        int[][] dp = new int[n+1][amount+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }


        return helper(coins , amount , n , dp);
    }

    public static int helper(int[] coins , int amount , int n , int[][] dp){
        if(n==0){
            return amount==0 ? 1 : 0;
        }


        if(dp[n][amount]!=-1){
            return dp[n][amount];
        }


        if(coins[n-1]<=amount){
            int take = helper(coins , amount-coins[n-1] , n , dp);
            int nottake = helper(coins , amount ,n-1,dp);
            return dp[n][amount] = take+nottake;
        }

        return dp[n][amount] = helper(coins , amount ,n-1 ,dp);
    }
}
