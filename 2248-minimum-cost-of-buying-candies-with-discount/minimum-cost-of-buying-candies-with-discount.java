class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==1){
            return cost[0];
        }
        Arrays.sort(cost);
        int total=0;
        for(int i=cost.length-1;i>0;i-=3){
            total+=cost[i]+cost[i-1];
        }
        if(cost.length%3==1){
            total += cost[0];
        }
        return total;
    }
}

