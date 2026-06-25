class Solution {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);

        while(area%w!=0){
            w--;
        }

        int l = area/w;

        int arr[]  = new int[2];
        arr[0] = l;
        arr[1] = w;
        return arr;
    }
}