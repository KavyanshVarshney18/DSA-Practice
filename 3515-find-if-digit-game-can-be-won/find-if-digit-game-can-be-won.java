class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigitsum=0;
        int doubledigitsum=0;
        for(int i=0;i<nums.length;i++){
            if(issingle(nums[i])){
                singledigitsum += nums[i];
            }
            else{
                doubledigitsum += nums[i];
            }
        }

        if(singledigitsum==doubledigitsum){
            return false;
        }
        return true;
    }

    public boolean issingle(int i){
        int count=0;
        while(i>0){
            count++;
            i=i/10;
        }
        if(count==1){
            return true;
        }
        return false;
    }
}