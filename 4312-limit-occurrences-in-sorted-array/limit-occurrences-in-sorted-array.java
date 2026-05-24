class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int x : map.keySet()){
            int freq = map.get(x);
            for(int i=0;i<Math.min(freq,k);i++){
                list.add(x);
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}