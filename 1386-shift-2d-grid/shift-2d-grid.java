class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int size =n*m;
        k=k%size;

        int[] arr = new int[n*m];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++] = grid[i][j]; 
            }
        }


        while(k-->0){
            int last = arr[arr.length-1];

            for(int i=arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }

        List<List<Integer>> ans = new ArrayList<>();
        idx=0;
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(arr[idx++]);
            }
            ans.add(row);
        }
        return ans;

        
    }
}