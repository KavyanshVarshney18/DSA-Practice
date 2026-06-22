class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();

        Set<String> set = new HashSet<>();
        for(String word : banned) {
            set.add(word.toLowerCase());
        }

        for(int i=0;i<paragraph.length();i++){
            StringBuilder sb = new StringBuilder();
            while(i<paragraph.length() && Character.isLetter(paragraph.charAt(i))){
                sb.append(Character.toLowerCase(paragraph.charAt(i)));
                i++;
            }
            String word = sb.toString();

            if(!set.contains(word) && !word.isEmpty() ){
                map.put(word, map.getOrDefault(word,0)+1);
            }
        }

        String ans = "";
        int max_freq = 0;
        for(String s : map.keySet()){
            if(map.get(s) > max_freq ){
                ans = s;
                max_freq = map.get(s);
            }
        }
        return ans;
    }
}