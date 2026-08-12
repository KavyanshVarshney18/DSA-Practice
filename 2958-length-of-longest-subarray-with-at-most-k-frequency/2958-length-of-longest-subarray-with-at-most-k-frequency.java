class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l =0;
        int r=0;
        HashMap<Integer , Integer> map = new HashMap<>();

        int n  = nums.length;
        int maxfreq = 0;

        while(r<n){
            map.put(nums[r] , map.getOrDefault(nums[r] , 0)+1);

            while(map.get(nums[r]) > k){
                map.put(nums[l] , map.get(nums[l])-1);
                l++;
            }
            maxfreq = Math.max(maxfreq , r-l+1);
            r++;
        }
        return maxfreq;

    }
}