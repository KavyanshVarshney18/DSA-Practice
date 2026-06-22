class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr  = new char[s.length()];
        int i=0;
        int j = s.length()-1;
        while(i<=j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left<right){
                arr[i] = left;
                arr[j] = left;
                
            }
            else if(right<left){
                arr[i] = right;
                arr[j] = right;
            }
            else{
                arr[i] = left;
                arr[j] = left;
            }
            i++;
            j--;
        }

        String sb = "";
        for(int k=0;k<s.length();k++){
            sb+=arr[k];
        }

        return sb;
    }
}