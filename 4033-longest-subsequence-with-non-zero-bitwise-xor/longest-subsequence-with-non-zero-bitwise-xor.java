class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = nums.length;
        int nonzero = 0;
        int xor =0;

        for(int x : nums){
            xor = xor ^ x;
            if(x!=0) nonzero++;
        }


        if(xor!=0) return ans;

        if(nonzero ==0) return 0;  //all 0 in arr

        return ans-1;
    }
}