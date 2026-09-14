class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }

        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();


        int i=0;
        while(i < sb.length() && sb.charAt(i)=='0'){
            i++;
        }

        if(i==sb.length()){
            return "0";
        }

        
        return sb.substring(i);
    }
}