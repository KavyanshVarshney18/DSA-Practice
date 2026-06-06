class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left= new int[n];
        left[0]=0;
        for(int i=1;i<n;i++){
            left[i] = left[i-1]+nums[i-1];
        }
        int[] right = new int[n];
        right[n-1]=0;
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]+nums[i+1];
        }

        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = Math.abs(right[i]-left[i]);
        }

        return ans;
    }
}



