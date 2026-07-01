class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int k : tasks){
            map.put(k , map.getOrDefault(k,0)+1);
        }


        int count=0;
        for(int k : map.keySet()){
            int val = map.get(k);


            if(val<=1){
                return -1;
            }

            if(val==2 || val==3){
                count++;
            }

            if(val>3){
                count+=(val+2)/3;
            }
        }
        return count;
    }
}