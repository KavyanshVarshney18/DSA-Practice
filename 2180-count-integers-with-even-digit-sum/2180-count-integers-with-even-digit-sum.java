class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(isvalid(i)){
                count++;
            }
        }
        return count;
    }

    public boolean isvalid(int i){
        int sum=0;
        while(i>0){
            int rem = i%10;
            sum+=rem;
            i=i/10;
        }
        if(sum%2==0){
            return true;
        }
        return false;
    }
}