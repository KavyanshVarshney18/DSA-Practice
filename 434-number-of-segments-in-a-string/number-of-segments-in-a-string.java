class Solution {
    public int countSegments(String s) {
        String[] str = s.split(" ");
        int c = 0;
        for(String x : str){
            if(x.length()!=0){
                c++;
            }
        }
        return c;
    
    }
}