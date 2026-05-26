class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for(char c : word.toCharArray()){
            set.add(c);
        }

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(set);

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<set.size();i++){
            char ch = list.get(i);
            char lower = Character.toLowerCase(ch);
            map.put(lower , map.getOrDefault(lower,0)+1);
        }

        int count = 0;
        for(char i : map.keySet()){
            if(map.get(i)==2){
                count++;
            }
        }
        return count;
    }
}
