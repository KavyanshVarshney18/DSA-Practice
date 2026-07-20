//passed 71/85

// class Solution {
//     public int[][] onesMinusZeros(int[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;

//         int[][] ans = new int[n][m];

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 int res = solve(i,j,grid);
//                 ans[i][j] = res;
//             }
//         }
//         return ans;
//     }


//     public int solve(int i , int j , int[][] grid){
//         int n=grid.length;
//         int m = grid[0].length;


//         int onesrow = 0;
//         int zerorow=0;
//         for(int k=0;k<m;k++){
//             if(grid[i][k]==1){
//                 onesrow++;
//             }else{
//                 zerorow++;
//             }
//         }

//         int onescol=0;
//         int zerocol=0;
//         for(int k=0;k<n;k++){
//             if(grid[k][j]==1){
//                 onescol++;
//             }
//             else{
//                 zerocol++;
//             }
//         }

//         int ans = onesrow+onescol - zerorow-zerocol;
//         return ans;
//     }
// }


class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[] rowonce = new int[n];
        int[] colonce = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    rowonce[i]++;
                    colonce[j]++;
                }
            }
        }
        int[][] ans = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int rowzero = n - rowonce[i];
                int colzero = m - colonce[j];
                int res = rowonce[i]+colonce[j] - rowzero -colzero;
                ans[i][j] = res;
            }
        }
        return ans;
    }
}