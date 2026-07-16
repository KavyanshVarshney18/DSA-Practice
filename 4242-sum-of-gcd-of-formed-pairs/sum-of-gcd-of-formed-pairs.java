class Solution {
    public long gcdSum(int[] nums) {
        int pregcd[] = new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            pregcd[i] = gcd(nums[i],max);
        }

        Arrays.sort(pregcd);
        int i=0;
        int j = pregcd.length-1;
        long sum=0;
       
        while(i<j){
            int sol = gcd(pregcd[i] , pregcd[j]);
            sum+=sol;
            i++;
            j--;
        }

        return sum;
    }



    public int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b , a%b);
    }
}