class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];


        int[] skipfirsthouse = new int[n-1];
        int[] skiplasthouse = new int[n-1];

        for(int i=1;i<n;i++){
            skipfirsthouse[i-1] = nums[i];
        }
        for(int i=0;i<n-1;i++){
            skiplasthouse[i] = nums[i];
        }

        int[] dp1 = new int[n];
        Arrays.fill(dp1,-1);

        int[] dp2 = new int[n-1];
        Arrays.fill(dp2,-1);

        int maxfromfirst = rob1( skipfirsthouse, n-2 , dp1);
        int maxfromsecond = rob1( skiplasthouse, n-2 , dp2);

        return Math.max(maxfromfirst , maxfromsecond);

    }


    public int rob1(int[] nums , int n , int[] dp){
        if(n<0) return 0;
        if(n==0) return nums[0];

        if(dp[n] != -1){
            return dp[n];
        }

        int include = rob1(nums , n-2 , dp) + nums[n];
        int exclude = rob1(nums , n-1 , dp) + 0;

        dp[n] = Math.max(include , exclude);
        return dp[n];
    }
}