class Solution {
    public int numSquares(int n) {
        int [] values = new int[n+1];
        for(int i = 0; i<=n; i++){
            values[i] = Integer.MAX_VALUE;
        }   
        values[0] = 0;
        int value = 1;
        
        while(value*value<=n){
            int perfect = value*value;

            for(int i=perfect; i<=n; i++){
                values[i] = Math.min(values[i-perfect]+1, values[i]);
            }
            value++;
        }
        return values[n];
    }
}
