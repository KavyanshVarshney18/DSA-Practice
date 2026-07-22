class Pair implements Comparable<Pair>{
    int val;
    int diff;

    Pair(int val , int diff){
        this.val = val;
        this.diff = diff;
    }

    public int compareTo(Pair p){
        if(this.diff == p.diff){
            return p.val - this.val;
        }
        return p.diff - this.diff;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int num : arr){
            pq.add(new Pair(num , Math.abs(x-num)));
            if(pq.size()>k){
                pq.remove();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(pq.size()>0){
            list.add(pq.remove().val);
        }
        Collections.sort(list);
        return list;
    }
}