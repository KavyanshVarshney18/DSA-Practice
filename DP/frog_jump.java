//problem statement : https://www.geeksforgeeks.org/problems/geek-jump/1

import java.util.*;
class Solution {
    int minCost(int[] height) {
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp,0);
        dp[0] =0;
        for(int i=1;i<n;i++){
            int first = dp[i-1]+Math.abs(height[i]-height[i-1]);
            int second = Integer.MAX_VALUE;
            if(i>1)
                second = dp[i-2]+Math.abs(height[i]-height[i-2]);
            dp[i]=Math.min(first,second);
        }
        return dp[n-1];
        
    }
}