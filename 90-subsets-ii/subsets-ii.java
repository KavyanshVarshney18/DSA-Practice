class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums , 0 , ans , new ArrayList<>());
        return ans;
    }



    public void helper(int[] nums , int i , List<List<Integer>> ans , List<Integer> curr){
        if(i==nums.length){
            if(!ans.contains(curr)){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        curr.add(nums[i]);
        helper(nums , i+1 , ans , curr);
        curr.remove(curr.size()-1);
        helper(nums , i+1 , ans , curr);
    }
}