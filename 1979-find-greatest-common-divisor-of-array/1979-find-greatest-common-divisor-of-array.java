class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = 0;
        for(int i=0;i<nums.length;i++){
            smallest = Math.min(smallest,nums[i]);
            largest = Math.max(largest , nums[i]);
        }

        int ans = gcd(smallest,largest);
        return ans;
    }

    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
