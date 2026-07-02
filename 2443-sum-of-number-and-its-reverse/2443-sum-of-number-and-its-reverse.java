class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;

        for(int i=1;i<=num;i++){
            int nums = i;
            int rev = rev(i);
            if(nums+rev == num){
                return true;
            }
        }
        return false;
    }

    public static int rev(int num){
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        return rev;
    }
}