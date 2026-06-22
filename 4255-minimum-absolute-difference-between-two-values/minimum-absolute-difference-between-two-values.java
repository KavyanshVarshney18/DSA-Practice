class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1 && nums[j]==2){
                    int diff = Math.abs(j-i);
                    min_diff= Math.min(min_diff , diff);
                }
            }
        }
        return min_diff==Integer.MAX_VALUE ? -1 : min_diff;
    }
}