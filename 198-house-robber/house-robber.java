class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int ans = solve(nums,n-1 ,dp);
        return ans;
    }


    public int solve(int[] nums,int n ,int[] dp){
        if(n<0) return 0;
        if(n==0) return nums[n];
        if(dp[n] != -1){
            return dp[n];
        }

        int incl = nums[n] + solve(nums,n-2 ,dp);
        int excl = 0 +        solve(nums,n-1,dp);

        dp[n] =  Math.max(incl,excl);

        return dp[n];
    }
}









// =============== RECURSION ============


// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int ans = solve(nums,n-1);
//         return ans;
//     }


//     public int solve(int[] nums,int n){
//         if(n<0) return 0;
//         if(n==0) return nums[n];


//         int incl = nums[n] + solve(nums,n-2);
//         int excl = 0+ solve(nums,n-1);

//         return Math.max(incl,excl);
//     }
// }