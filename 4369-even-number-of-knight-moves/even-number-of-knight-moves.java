class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sum1 = start[0]+start[1];
        int sum2 = target[0]+target[1];
        if(sum1%2==0 && sum2%2==0  || sum1%2!=0 && sum2%2!=0){
            return true;
        }
        return false;
    }
}
