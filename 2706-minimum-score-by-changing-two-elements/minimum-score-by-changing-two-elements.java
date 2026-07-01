class Solution {
    public int minimizeSum(int[] nums) {
        if(nums.length<=3) return 0;
        if(nums.length>=4){
            Arrays.sort(nums);
            return Math.min(nums[nums.length-1] - nums[2] , Math.min(
                nums[nums.length-2] - nums[1],
                nums[nums.length-3] - nums[0]
            ));
        }
        return 0;
    }
}

