class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int n = arr.length;
        int current;
        for(int i=0; i<n; i++){
            current = arr[i];
            arr[i] = max;
            max = Math.max(max,current);
        }
        return arr;
    }
}
