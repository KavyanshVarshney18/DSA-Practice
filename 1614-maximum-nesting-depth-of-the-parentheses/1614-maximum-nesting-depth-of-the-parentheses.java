class Solution {
    public int maxDepth(String s) {
        int maxopen =0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                maxopen++;
                ans = Math.max(ans , maxopen);
            }
            else if(c==')'){
                maxopen--;
            }

        }
        return ans;
    }
}