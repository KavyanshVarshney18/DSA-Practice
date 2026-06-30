class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3];
        int count=0;
        int curr_count =0;
        int l=0;
        int n=s.length();

        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            freq[ch-'a']++;
            if(freq[ch-'a']==1){
                curr_count++;
            }
            while(curr_count==3){
                count += (n-r);
                char c = s.charAt(l);
                freq[c-'a']--;
                if(freq[c-'a']==0){
                    curr_count--;
                }
                l++;
            }
        }
        return count;
    }
}

//                              BRUTE FORCE

// class Solution {
//     public int numberOfSubstrings(String s) {
//         int cnt=0;
//         for(int i=0;i<s.length();i++){
//             int[] hash = new int[3];
//             for(int j=i;j<s.length();j++){
//                 hash[s.charAt(j)-'a'] =1;
//                 if(hash[0]+hash[1]+hash[2]==3){
//                     cnt += s.length()-j;                 //n-j bs we already have abc now whatever will come after will also contain abc so we will subtract it from length and current index at which they have abc.
//                     break;
//                 }
//             }
//         }
//         return cnt;
//     }
// }