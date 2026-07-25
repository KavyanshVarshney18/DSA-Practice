class Solution {
    public int maxProduct(int n) {
        int first_largest =0;
        int second_largest =0;
        while(n>0){
            int rem = n%10;
            if(rem>first_largest){
                second_largest = first_largest;
                first_largest = rem;
            }else if(rem>second_largest){
                second_largest = rem;
            }
            n=n/10;
        }

        return first_largest * second_largest;
    }
}