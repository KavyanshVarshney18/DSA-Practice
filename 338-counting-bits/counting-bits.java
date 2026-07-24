class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<=n;i++){
            String val = Integer.toString(i,2);
            int one = countone(val);
            ans[i] = one;
        }
        return ans;
    }

    public int countone(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}