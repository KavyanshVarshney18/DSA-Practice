class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return nums;
        }
        Stack<Integer> arr1 = new Stack<>();
        Stack<Integer> arr2 = new Stack<>();
        arr1.push(nums[0]);
        arr2.push(nums[1]);
        for(int i=2;i<n;i++){
            if(arr1.peek() > arr2.peek()){
                arr1.push(nums[i]);
            }else{
                arr2.push(nums[i]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : arr1){
            list.add(ele);
        }

        for(int ele : arr2){
            list.add(ele);
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = list.get(i);
        }

        return ans;

    }
}