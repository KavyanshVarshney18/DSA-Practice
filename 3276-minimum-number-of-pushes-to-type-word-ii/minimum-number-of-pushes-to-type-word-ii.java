class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            freq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);

        int ans=0;
        for(int i=25;i>=0 && freq[i]>0 ;i--){
            int ind = ((25-i)/8) +1;

            ans += freq[i] * ind;
        }
        return ans;

    }
    // 1 -> x -> 4  (i/8+1);
    //      y -> 4
    //      z -> 4

    // 2 -> a -> 2
    //     b-> 2
    //     c -> 2
    //     d -> 2
    //     e -> 2
    //     f -> 2
    //     g ->2
    //     h -> 2
    //     i -> 6

}