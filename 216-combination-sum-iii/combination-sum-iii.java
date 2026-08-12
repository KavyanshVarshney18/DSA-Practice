class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(k>n){
            return new ArrayList<>();
        }

        int[] nums = new int[9];
        int j=1;
        for(int i=0;i<nums.length;i++){
            nums[i] = j++;
        }
        List<List<Integer>> list = new ArrayList<>();
        
        helper(nums , n , k, 0 , new ArrayList<>() , list);
        return list;
    }


    public void helper(int[] nums , int target  , int k ,int i, List<Integer> curr ,List<List<Integer>> list){
       if(k==0){
            if(target==0){
                list.add(new ArrayList<>(curr));
            }
            return;
        }
        if(target<0 || i==nums.length){
            return;
        }

       curr.add(nums[i]);
       helper(nums , target-nums[i] , k-1 , i+1  ,curr , list);
       curr.remove(curr.size()-1);
       helper(nums , target , k , i+1 , curr , list);
    }   
}