class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();


        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isLowerCase(c)){
                sb.append(c);
            }

            if(sb.length() > 0){
                if(c=='*'){
                sb.setLength(sb.length()-1);
                }
            }

            if(c=='#'){
                sb.append(sb);
            }

            if(c=='%'){
                sb.reverse();
            }
        }
        return sb.toString();
        
    }
}