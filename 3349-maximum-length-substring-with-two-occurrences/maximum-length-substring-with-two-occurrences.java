class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0;
        int j=0;
        int max_len =0;
        int[] freq = new int[26];
        int bad = 0;

        while(j<s.length()){
            char ch = s.charAt(j);
            
            freq[ch-'a']++;

            if(freq[ch-'a']==3){
                bad++;
            }

            while(bad>0){
                char left = s.charAt(i);
                if(freq[left-'a']==3){
                    bad--;
                }
                freq[left-'a']--;
                i++;
            }

            max_len = Math.max(max_len,j-i+1);
            j++;

        }
        return max_len;
    }
}