class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer>[][] dp = new ArrayList[n][n + 1];
        return helper(nums , n , 0 ,-1,dp);
    }



    public static List<Integer> helper(int[] nums , int n , int currind , int prevind ,List<Integer>[][] dp){
        if(currind == n){
            return new ArrayList<>();
        }

        if(dp[currind][prevind+1]!=null){
            return new ArrayList<>(dp[currind][prevind + 1]);
        }

        List<Integer> take = new ArrayList<>();
        if(prevind == -1 || nums[currind] % nums[prevind]==0 || nums[prevind]%nums[currind] ==0){
           take =  helper(nums , n , currind+1 ,currind ,dp);

           take = new ArrayList<>(take);
           take.add(0 , nums[currind]);
        }

        List<Integer> nottake = helper(nums , n , currind+1 ,prevind ,dp);

        if(take.size() > nottake.size()) {
            return dp[currind][prevind+1]= new ArrayList<>(take);
        } else {
            return dp[currind][prevind+1] =new ArrayList<> (nottake);
        }

    }   
}

