class Solution {

    public boolean check(int[] hash){
        int possibleFreq = -1;
        for(int freq : hash){
            if(freq != 0){
                if(possibleFreq == -1)  possibleFreq = freq;
                else if(freq == possibleFreq)   continue;
                else    return false;
            }
        }
        return true;
    }

    public boolean equalFrequency(String word) {
        int[] hash = new int[26];

        for(char ch : word.toCharArray()){
            hash[ch - 'a']++;
        }

        for(int i = 0;i<26;i++){
            if(hash[i] != 0){
                hash[i]--;
                if(check(hash)) return true;
                hash[i]++;
            }
        }
        return false;
    }
}