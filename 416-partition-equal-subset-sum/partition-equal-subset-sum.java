class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int ele : nums){
            sum+=ele;
        }
        if(sum%2!=0) return false;
        Boolean[][] dp = new Boolean[n+1][sum+1];
        return helper(nums , n , sum/2 ,dp);
    }


    public boolean helper(int[] nums , int n , int sum ,Boolean[][] dp){
        if(sum==0){
            return true;
        }
        if(n==0){
            return false;
        }


        if(dp[n][sum] != null){
            return dp[n][sum];
        }

        if(nums[n-1]<=sum){
            return dp[n][sum] = helper(nums , n-1 , sum-nums[n-1],dp) || helper(nums,n-1,sum,dp);
        }

        return helper(nums,n-1,sum,dp);
    }


}