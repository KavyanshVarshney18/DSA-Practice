class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length-1];
        int b = nums[nums.length-2];
        int c = nums[nums.length-3];

        int d = nums[0];
        int e = nums[1];
        int ans1 = a*b*c;
        int ans2 = d*e*a;

        return Math.max(ans1,ans2);
    }
    
}