class Solution {
    public long sumAndMultiply(int n) {
        String s  = Integer.toString(n);
        String t = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                t+=s.charAt(i);
            }
        }
        if(t.length()==0){
            return 0;
        }

        int sum=0;
        for(int i=0;i<t.length();i++){
            sum+=t.charAt(i)-'0';
        }
        long digit = Long.parseLong(t);

        long ans = digit*sum;
        return ans;
    }
}