class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];    //n+1 bc we are going from -1 to n-1;

        for(int[] row : dp){
            Arrays.fill(row ,-1);
        }

        return helper(nums , n , 0 , -1 ,dp);  //0 -> curr ind , -1 -> prev ind
    }



    public int helper(int[] nums , int n , int currind , int prevind ,int[][] dp){
        if(currind == n){
            return 0;
        }

        if(dp[currind][prevind+1] != -1){
            return dp[currind][prevind+1];
        }

        int take =0;
        if(prevind == -1 || nums[currind] > nums[prevind]){
            take = 1 + helper(nums , n , currind+1 , currind ,dp);
        }


        int nottake = helper(nums  , n , currind+1 , prevind ,dp);

        return dp[currind][prevind+1] = Math.max(take,nottake);
    }
}

// ===================== recursion ================== 

// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         return helper(nums , n , 0 , -1);  //0 -> curr ind , -1 -> prev ind
//     }



//     public int helper(int[] nums , int n , int currind , int prevind){
//         if(currind == n){
//             return 0;
//         }


//         int take =0;
//         if(prevind == -1 || nums[currind] > nums[prevind]){
//             take = 1 + helper(nums , n , currind+1 , currind);
//         }


//         int nottake = helper(nums  , n , currind+1 , prevind);

//         return Math.max(take,nottake);
//     }
// }