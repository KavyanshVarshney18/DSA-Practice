class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j = nums.length-1;
        HashSet<Double> set = new HashSet<>();
        while(i<j){
            double avg = (nums[i]+nums[j])/2.0;
            set.add(avg);
            i++;
            j--;
        }
        return set.size();

    }
}

