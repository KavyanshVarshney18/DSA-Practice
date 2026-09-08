class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return helper(nums,0,dp);
    }


    public boolean helper(int[] nums , int i,Boolean[] dp){
        if(i==nums.length-1){
            return true;
        }
        if(dp[i]!=null){
            return dp[i];
        }

        for(int j=1;j<=nums[i];j++){
            int next = i+j;
            if(helper(nums,next,dp)==true){
                return dp[i] = true;
            }
        }

        return dp[i] = false;
    }

    
}