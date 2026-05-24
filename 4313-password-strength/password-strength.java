class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        for(char c : password.toCharArray()){
            set.add(c);
        }
        int strength = 0;
        

        for(char c : set){
            if(c>=65 && c<=90){
                strength+=2;
            }
            if(c>=97 && c<=122){
                strength+=1;
            }
            if(c>=48 && c<=57){
                strength+=3;
            }
            if(c=='!' || c=='@' || c=='#' || c=='$'){
                strength+=5;
            }

        }

        return strength;


    }
}