class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int size = n*m;
        int[] arr = new int[size];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++] = matrix[i][j];
            }
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}