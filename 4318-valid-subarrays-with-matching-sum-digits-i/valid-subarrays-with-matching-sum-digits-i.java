class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(isvalid(sum , x)){
                    count++;
                }
            }
        }

        return count;
    }



    public boolean isvalid(long sum , int x){
        if(sum==x){
            return true;
        }
        if(sum == 0) {
            return x == 0;
        }
        long lastDigit = sum % 10;

        long firstDigit = sum;
        while(firstDigit >= 10) {
            firstDigit /= 10;
        }

        return firstDigit == x && lastDigit == x;
    }
}