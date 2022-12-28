class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<> ((a,b) -> b-a);
        for (int num: piles)
            heap.add(num);
        
        for(int i = 0 ; i<k; i++){
            int current = heap.remove();
            int remove = current/2;
            heap.add(current-remove);
        }

        int result = 0;
        for(int num: heap)
            result += num;

        return result;
    }
}
