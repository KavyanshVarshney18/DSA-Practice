class Solution {

    int countdigits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        //prefixes of arr1
        HashSet<Integer> prefix = new HashSet<>();
        for(int num : arr1){
            int x = num;
            while(x>0){
                prefix.add(x);
                x=x/10;
            }
        }

        int ans_count=0;

        for(int num : arr2){
            int x = num;
            int len = countdigits(x);


            while(x>0){
                if(prefix.contains(x)){
                    ans_count = Math.max(ans_count , len);
                    break;
                }
                x=x/10;
                len--;
            }
        }
        return ans_count;


    }
}