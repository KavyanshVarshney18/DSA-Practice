class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max1 = nums[n-1]-1;
        int max2 = nums[n-2]-1;
        return max1*max2;
    }
}