class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int fullBags = 0;

        // sort bags by the remaining capacity
        int [] remainingCapacity = new int[n];
        for(int i=0; i<n ; i++){
            remainingCapacity[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(remainingCapacity);

        // add additional rocks 
        for(int i = 0; i<n ; i++){
            //  add rock if the bag has empty space
            if(additionalRocks >= remainingCapacity[i]){
                additionalRocks -= remainingCapacity[i];
                fullBags++;
            }
            else{
                break;
            }
        }
        return fullBags;
    }
} 
