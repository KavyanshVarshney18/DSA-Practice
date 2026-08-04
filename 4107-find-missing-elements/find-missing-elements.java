class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int start = nums[0];
        int end = nums[n-1];

        List<Integer> ans = new ArrayList<>();
        int j = 0;

        for(int i=start;i<=end;i++){
            while(j<n && nums[j]<i) {
                j++;
            }

            if(j==n||nums[j]!=i){
                ans.add(i);
            }
        }

        return ans;
    }
}