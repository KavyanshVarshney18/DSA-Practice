class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        for(int i=0;i<n;i++){
            int max = max(nums[i]);
            int min = min(nums[i]);
            diff[i] = max-min;
        }

        int maxdig = 0;
        for(int i=0;i<n;i++){
            maxdig = Math.max(maxdig , diff[i]);
        }

        int sum=0;
        for(int i=0;i<n;i++){
            if(diff[i]==maxdig){
                sum+=nums[i];
            }
        }
        return sum;


    }

    public int max(int num){
        int max=0;
        while(num>0){
            int rem = num%10;
            max  = Math.max(max,rem);
            num = num/10;
        }
        return max;
    }

    public int min(int num){
        int min=Integer.MAX_VALUE;
        while(num>0){
            int rem = num%10;
            min  = Math.min(min,rem);
            num = num/10;
        }
        return min;
    }

}