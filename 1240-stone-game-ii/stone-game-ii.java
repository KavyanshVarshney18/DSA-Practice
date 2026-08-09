// class Solution {
//     public int stoneGameII(int[] piles) {
//         int n = piles.length;
//         return solveforalice(piles , 1 , 0 , 1);    
//         //1 -> alice turn 0-> bob turn , 0-> start index , 1 -> M value
//     }


//     public int solveforalice(int[] nums , int person , int i , int m){
//         int n = nums.length;
//         if(i>=n){
//             return 0;
//         }


//         int result = person == 1 ?-1 : Integer.MAX_VALUE;
//         // bc we need to find max for alice and min for bob 

//         int stone =0;
//         for(int x=1 ; x<= Math.min(2*m , n-i) ; x++){

//             stone+=nums[i+x-1];

//             if(person==1){ //Alice
//                 result = Math.max(result , stone + solveforalice(nums , 0 , i+x ,Math.max(x,m)));
//             }
//             else{
//                 result = Math.min(result , solveforalice(nums , 1 , i+x , Math.max(x,m)));
//             }
//         }
//         return result;
//     } 
// }



class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        Integer[][][] dp = new Integer[2][101][101];   //2 -> 2 player and for each 101 
  
        return solveforalice(piles , 1 , 0 , 1 ,dp);    
        //1 -> alice turn 0-> bob turn , 0-> start index , 1 -> M value
    }


    public int solveforalice(int[] nums , int person , int i , int m ,Integer[][][] dp){
        int n = nums.length;
        if(i>=n){
            return 0;
        }

        if(dp[person][i][m]!=null){
            return dp[person][i][m];
        }


        int result = person == 1 ?-1 : Integer.MAX_VALUE;
        // bc we need to find max for alice and min for bob 

        int stone =0;
        for(int x=1 ; x<= Math.min(2*m , n-i) ; x++){
            
            stone+=nums[i+x-1];

            if(person==1){ //Alice
                result = Math.max(result , stone + solveforalice(nums , 0 , i+x ,Math.max(x,m) , dp) );
            }
            else{
                result = Math.min(result , solveforalice(nums , 1 , i+x , Math.max(x,m) , dp));
            }
        }
        return dp[person][i][m] = result;
    } 
}