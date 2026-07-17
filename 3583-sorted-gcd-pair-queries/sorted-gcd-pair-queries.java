//713/721 passed
//         int n = nums.length;
//         long pairs = 1L*n*(n-1)/2;
//         int[] ans = new int[(int)pairs];
//         int k=0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int cal = gcd(nums[i],nums[j]);
//                 ans[k++] = cal;
//             }
//         }
//         Arrays.sort(ans);
//         int[] res = new int[queries.length];
//         for(int i=0;i<queries.length;i++){
//             res[i] = ans[(int)queries[i]];
//         }
//         return res;
//     }


//     public int gcd(int a , int b){
//         if(b==0){
//             return a;
//         }
//         return gcd(b, a%b);
//     }

class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        // Frequency of each number
        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        // Count numbers divisible by i
        int[] count = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                count[i] += freq[j];
            }
        }

        // Exact pairs with gcd = i
        long[] gcdPairs = new long[max + 1];
        for (int i = max; i >= 1; i--) {
            long pairs = (long) count[i] * (count[i] - 1) / 2;
            for (int j = i * 2; j <= max; j += i) {
                pairs -= gcdPairs[j];
            }
            gcdPairs[i] = pairs;
        }

        // Prefix sum
        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + gcdPairs[i];
        }

        int[] ans = new int[queries.length];

        for (int k = 0; k < queries.length; k++) {
            long target = queries[k] + 1;

            int left = 1, right = max;
            while (left < right) {
                int mid = (left + right) / 2;
                if (prefix[mid] >= target)
                    right = mid;
                else
                    left = mid + 1;
            }
            ans[k] = left;
        }

        return ans;
    }
}