class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int expected = sum;
        for(int i=0;i<n;i++){
            if(nums[i]>=expected){
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        if(list.size() ==0){
            return expected;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==expected){
                expected++;
            }
        }
        return expected;
    }
}
