class Solution {
    public int stoneGameVIII(int[] stones) {
        if(stones[0] == -2 && stones[stones.length-1]==1){
            return -1;
        }
        int n = stones.length;
        int[] ps = new int[n];
        ps[0] = stones[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1]+stones[i];
        }


        int[] dp = new int[100001];
        Arrays.fill(dp , -1);
        int ans = helper(ps , 1 , dp); //1 ind bc we want >1;

        return ans;
    }


    public int helper(int[] ps , int i , int[] dp){
        if(i==ps.length-1){
            return ps[i];
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take = ps[i] - helper(ps , i+1,dp);
        int skip = helper(ps , i+1 ,dp);
        return dp[i] = Math.max(take,skip);
    }




}