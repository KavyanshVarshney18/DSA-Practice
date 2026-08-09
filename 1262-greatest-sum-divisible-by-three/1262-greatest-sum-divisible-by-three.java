class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%3==0){
            return sum;  //best case
        }


        //other wise rem => 1,2
        //if rem=>2 find candidate whose rem comes 2 and remove it ,
        // if no candidate value   is coming 2 then find two candidate with rem 1 and 1 bc 1+1=2 and remove it

        //if rem=> 1 find candidate whose rem is 1 and remove .
        //if no rem 1 candidate found then find two candidate with rem 2 as the candidate with rem 2 when we add those 2 value and %3 then rem comes out to be 1;

        ArrayList<Integer> rem1 = new ArrayList<>();
        ArrayList<Integer> rem2 = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==1){
                rem1.add(nums[i]);
            }
            else if(nums[i]%3==2){
                rem2.add(nums[i]);
            }
        }

        Collections.sort(rem1);
        Collections.sort(rem2); //to find min value to remove


        int result =0;
        int rem = sum%3 ;  //1 or 2

        if(rem==1){
            int remove1 = rem1.size()>=1?rem1.get(0) : Integer.MAX_VALUE;
            int remove2 = rem2.size()>=2?rem2.get(0)+rem2.get(1)  : Integer.MAX_VALUE;
            result = Math.max(result , sum-Math.min(remove1 , remove2));
        }else{
            int remove1 = rem2.size()>=1 ? rem2.get(0) : Integer.MAX_VALUE;
            int remove2 = rem1.size()>=2 ? rem1.get(0) + rem1.get(1) : Integer.MAX_VALUE;
            result = Math.max(result , sum-Math.min(remove1 , remove2));
        }
        return result;

    }

        
}

// class Solution {
//     public int maxSumDivThree(int[] nums) {
//         int sum = 0;
//         for(int i=0;i<nums.length;i++){
//             sum += nums[i];
//         }
//         if(sum%3==0){
//             return sum;
//         }

//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             if((sum-nums[i]) %3 ==0 ){
//                 return sum-nums[i];
//             }
//         }
//         return -1;
//     }
//}