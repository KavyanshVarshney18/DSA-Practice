class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int cap = capacity;
        for(int i=0;i<plants.length;i++){
            if(cap >= plants[i]){
                steps++;
                cap -= plants[i];
            }
            else{
                cap = capacity;
                cap-=plants[i];
                steps += (2*i)+1;
            }

        }

        return steps;
    }
}