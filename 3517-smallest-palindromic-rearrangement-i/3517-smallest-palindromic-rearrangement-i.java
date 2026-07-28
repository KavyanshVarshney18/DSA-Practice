class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n==1) return s;


        int middle = n/2;

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<middle;i++){
            sb.append(s.charAt(i));
        }

        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);

        sb.setLength(0);
        sb.append(chars);
        String first = sb.toString();
        if(n%2==1){
            sb.append(s.charAt(middle));
        }
        sb.append(new StringBuilder(first).reverse());
        return sb.toString();
    }
}