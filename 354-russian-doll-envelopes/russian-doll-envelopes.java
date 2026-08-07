class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes , (a,b) -> {
            if(a[0] == b[0]){   // if same 
                return b[1]-a[1]; 
            }
            return a[0] - b[0]; 
        });

        int n = envelopes.length;
        int[] arr = new int[envelopes.length];
        for(int i=0;i<n;i++){
            arr[i] = envelopes[i][1];
        }

        return helper(arr,n);
    }


    public int helper(int[] arr , int n){
        if(n==0){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i=1;i<n;i++){
            if(arr[i] > list.get(list.size()-1)){
                list.add(arr[i]);
            }
            else{
                // find index of just upper value
                int index = lowerbound(list , arr[i]);
                list.set(index, arr[i]);
            }
        }
        return list.size();

    }


     public int lowerbound(ArrayList<Integer> list, int target) {

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}



//  ================ 85/87 passed =============

// class Solution {
//     public int maxEnvelopes(int[][] envelopes) {
//         Arrays.sort(envelopes , (a,b) -> {
//             if(a[0] == b[0]){   // if same 
//                 return b[1]-a[1]; 
//             }
//             return a[0] - b[0]; 
//         });

//         int n = envelopes.length;
//         int[] arr = new int[envelopes.length];
//         for(int i=0;i<n;i++){
//             arr[i] = envelopes[i][1];
//         }

//         int[][] dp = new int[n][n+1];
//         for(int[] row : dp){
//             Arrays.fill(row , -1);
//         }

//         return lishelper(arr , n , 0 ,-1 , dp);
//     }

//     public int lishelper(int[] arr , int n , int currind , int prevind , int[][] dp){
//         if(currind == n){
//             return 0;
//         }
//         if(dp[currind][prevind+1]!=-1){
//             return dp[currind][prevind+1];
//         }

//         int take =0;
//         if(prevind==-1 || arr[currind] > arr[prevind]){
//             take = 1+ lishelper(arr,n , currind+1 , currind ,dp);
//         }

//         int nottake = lishelper(arr,n,currind+1 , prevind , dp);

//         return dp[currind][prevind+1] = Math.max(take,nottake);
//     }
// }