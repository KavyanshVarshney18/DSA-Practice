class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int ans = -1;
        for(int i=0;i<n;i++){
            int sum = sumofdigit(nums[i]);
            System.out.println(sum);
            if(sum==i){
                return i;
            }
        }
        return ans;
    }


    public int sumofdigit(int n){
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
}