class Solution {
    public int numSquares(int n) {
        int maxRoot = (int) Math.sqrt(n);
        int[] squares = new int[maxRoot];
        for (int i = 0; i < maxRoot; i++) {
            squares[i] = (i + 1) * (i + 1);
        }

        int[][] dp = new int[maxRoot + 1][n + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int ans = helper(squares, n, maxRoot, dp);
        return ans >= (int)1e9 ? -1 : ans;
    }
     public static int helper(int[] coins , int amount , int n , int[][] dp){
        if(amount == 0)
            return 0;

        if(n == 0)
            return (int)1e9;


        if(dp[n][amount]!=-1){
            return dp[n][amount];
        }


        if(coins[n-1]<=amount){
            int take = 1+helper(coins , amount-coins[n-1] , n , dp);
            int nottake = helper(coins , amount ,n-1 ,dp);
            return dp[n][amount] = Math.min(take , nottake);
        }

        return dp[n][amount] = helper(coins , amount ,n-1 ,dp);
    }
}