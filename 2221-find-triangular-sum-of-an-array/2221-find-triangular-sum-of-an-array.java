class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }   
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }


        while(list.size()>1){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<list.size()-1;i++){
                temp.add((list.get(i)+list.get(i+1))%10);
            }
            list = temp;
        }
        return list.get(0);

    }
}