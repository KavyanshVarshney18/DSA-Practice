class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;

        Map<Integer,Integer> groupMap = new HashMap<>();
        List<List<Integer>> groups = new ArrayList<>();
        int[] temp=nums.clone();
        Arrays.sort(temp);

        List<Integer> g=new ArrayList<>();
        g.add(temp[0]);
        int gNumber=0;
        groupMap.put(temp[0],gNumber);

        for(int i=1;i<n;i++){
            if(Math.abs(temp[i]-temp[i-1])<=limit){ 
                g.add(temp[i]);
                groupMap.put(temp[i],gNumber);
            }
            else{
                groups.add(g);
                g=new ArrayList<>();
                g.add(temp[i]);
                gNumber++;
                groupMap.put(temp[i],gNumber);
            }
        }

        groups.add(g);

        int[] indxes = new int[groups.size()];

        for(int i=0;i<n;i++){
            gNumber = groupMap.get(nums[i]);
            
            nums[i]=groups.get(gNumber).get(indxes[gNumber]);
            indxes[gNumber]++;
        }

        return nums;
    }
}