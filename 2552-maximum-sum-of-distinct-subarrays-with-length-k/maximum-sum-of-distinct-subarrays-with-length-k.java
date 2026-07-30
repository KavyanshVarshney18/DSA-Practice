class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] freq=new int[100001];

        int i=0;
        int j=0;
        long sum=0;
        long maxsum=0;
        int n= nums.length;


        int duplicate =0;
        while(j < n){
            sum += nums[j];
            freq[nums[j]]++;

            if(freq[nums[j]]==2){
                duplicate++;
            }

            if(j-i+1 > k){
                if(freq[nums[i]]==2){
                    duplicate--;
                }
                freq[nums[i]]--;
                sum -= nums[i];
                i++;
            }

            if(j-i+1 ==k && duplicate==0){
                maxsum = Math.max(sum , maxsum);
            }
            j++;
        }

        return maxsum;
    }
}