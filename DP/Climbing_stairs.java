// problem statement = https://leetcode.com/problems/climbing-stairs/description/
import java.util.*;
class Solution {
    public int fibonacci(int n, int[] arr){
        if(n==0 || n==1 || n==2){
            return n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        return arr[n] = fibonacci(n-1,arr)+fibonacci(n-2,arr);
    }
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        return fibonacci(n,arr);
    }
}