class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : nums){
            pq.offer(x);
        }

        while(k-->0){
            int x = pq.poll();
            score+=x;
            pq.add((int)Math.ceil(x/3.0));
        }

        return score;


    }
}

