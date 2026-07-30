class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int i=0;
        int j=0;

        int n =nums.length;
        int product =1;


        while(j<n){
            product*=nums[j];

            while(product >=k && i<=j){
                product = product /nums[i];
                i++;
            }

            count+=j-i+1;
            j++;
        }
        return count;
    }
}