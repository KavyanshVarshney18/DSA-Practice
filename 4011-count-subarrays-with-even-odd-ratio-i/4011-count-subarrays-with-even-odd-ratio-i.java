class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int count=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int odd =0;
            int even = 0;
            for(int j=i ; j<n ;j++){
                if(nums[j]%2 ==0 ){
                    even++;
                }
                else{
                    odd++;
                }
                if(odd > 0 && (long)even*b<=(long)odd*a){
                    count++;
                }
            }
        }
        return count;
    }
}