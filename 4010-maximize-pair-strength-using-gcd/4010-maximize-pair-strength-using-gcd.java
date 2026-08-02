class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long ans = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long g = gcd(nums[i], nums[j]);
                long val = 1L*nums[i]*nums[j]/(g * g);
                ans = Math.max(ans, val);
            }
        }
        return ans;
    }


    public int gcd(int a , int b){
        if(b==0){
            return a;
        }

        return gcd(b , a%b );
    }
}