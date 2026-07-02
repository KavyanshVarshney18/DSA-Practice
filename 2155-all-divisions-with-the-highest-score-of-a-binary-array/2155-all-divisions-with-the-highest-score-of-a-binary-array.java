class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int total_ones = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                total_ones++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        ans.add(0);    //bc breaking at 0th index

        int rightscore= total_ones;
        int leftscore =0;
        int max_score= rightscore+leftscore;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                leftscore++;
            }
            else if(nums[i]==1){
                rightscore--;
            }

            int currentscore = leftscore+rightscore;
            if(currentscore > max_score){
                ans.clear(); 
                max_score = currentscore;
                ans.add(i+1);
            }
            else if(currentscore == max_score){
                ans.add(i+1);
            }
        }

        return ans;
       
    }
}                                                                                                                           