class Pair implements Comparable<Pair>{
    int num;
    int freq;

    Pair(int num,int freq){
        this.num = num;
        this.freq = freq;
    }

    public int compareTo(Pair p){
        if(this.freq == p.freq) return Integer.compare(this.num , p.num);

        return Integer.compare(this.freq,p.freq);
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele , freq));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[] ans = new int[pq.size()];
        int idx=0;
        while(pq.size()>0){
            Pair top = pq.remove();
            int val = top.num;
            ans[idx++] = val;
        }
        return ans;
    }
}