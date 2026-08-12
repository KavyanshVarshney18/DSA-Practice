class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums , target , 0 , ans , new ArrayList<>());
        return ans;
    }

    public static void helper(int[] nums , int target , int i ,List<List<Integer>> ans , List<Integer> curr){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target<0 || i==nums.length)  {
            return;
        }
        curr.add(nums[i]);
        helper(nums , target-nums[i] , i , ans , curr);
        curr.remove(curr.size()-1);
        helper(nums , target , i+1 , ans , curr);

    }
}