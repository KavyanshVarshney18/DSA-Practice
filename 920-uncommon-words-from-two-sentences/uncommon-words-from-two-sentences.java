class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] str = s1.split(" ");
        for(int i=0;i<str.length;i++){
            String s = str[i];
            map.put(s , map.getOrDefault(s,0)+1);
        }
        String[] str1 = s2.split(" ");
        for(int i=0;i<str1.length;i++){
            String s = str1[i];
            map.put(s , map.getOrDefault(s,0)+1);
        }

        List<String> list = new ArrayList<>();
        for(String k : map.keySet()){
            if(map.get(k)==1){
                list.add(k);
            }
        }
        String[] ans = new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;


        
    }
}