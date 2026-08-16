class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openbrkt = new Stack<>();
        Stack<Integer> astrik = new Stack<>();


        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                openbrkt.push(i);
            }
            else if(c=='*'){
                astrik.push(i);
            }
            else{
                if(!openbrkt.isEmpty()){
                    openbrkt.pop();
                }
                else if(!astrik.isEmpty()){
                    astrik.pop();
                }
                else{
                    return false;
                }
            }
        }

        while(!openbrkt.isEmpty()){
            if(astrik.isEmpty()){
                return false;
            }

            else if(openbrkt.pop() > astrik.pop()){
                return false;
            }
        }
        return true;


    }
}