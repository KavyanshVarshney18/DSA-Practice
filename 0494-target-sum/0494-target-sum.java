class Solution {
    public int findTargetSumWays(int[] nums, int diff) {
        int n = nums.length;

        int sum=0;
        for(int ele : nums){
            sum+=ele;
        }
        if(Math.abs(diff)>sum || (sum+diff)%2!=0){
            return 0;
        }

        int target = (diff+sum)/2;
        int[][] dp = new int[n+1][target+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        return helper(nums , target , n , dp);
    }


    public static int helper(int[] nums , int target , int n , int[][] dp){
        if(n==0){
            return target==0?1:0;
        }

        if(dp[n][target]!=-1){
            return dp[n][target];
        }


        if(nums[n-1]<=target){
            return dp[n][target] = helper(nums , target-nums[n-1] , n-1 ,dp) + helper(nums,target,n-1,dp);
        }

        return dp[n][target] = helper(nums,target,n-1,dp);
    }
}