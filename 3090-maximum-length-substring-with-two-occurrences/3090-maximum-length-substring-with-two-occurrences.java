class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[] = new int[26];
        int l=0;
        int r = 0;
        int n = s.length();
        int maxlen =0;
        while(r<n){
            char c = s.charAt(r);
            freq[c - 'a']++;
            while(freq[s.charAt(r) -'a'] > 2){
                freq[s.charAt(l)-'a']--;
                l++;
            }
            maxlen = Math.max(maxlen , r-l+1);
            r++;
        }
        return maxlen;
    }
}