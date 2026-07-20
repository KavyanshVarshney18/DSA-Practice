class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        solve(n , 0 ,0,"",ans);
        return ans;

    }

    public void solve(int n , int openbkt ,int closebkt ,String str , List<String>ans ){
        if(openbkt==n && closebkt==n){
            ans.add(str);
            return;
        }

        //add (
        if(openbkt<n){
            solve(n ,openbkt+1 , closebkt , str+'(' ,ans);
        }

        //add )
        if(closebkt< openbkt){
            solve(n ,openbkt , closebkt+1 , str+')' ,ans);
        }

    }


    
}