class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap();

        // store the frequencies in the map
        for(int task: tasks)
            freq.put(task,freq.getOrDefault(task,0) +1);
        
        int min_round = 0;
        // iterate over the tasks's frequencies 
        for(int count : freq.values()){
            // if freq is 1, you cannot complete the task
            if(count==1)
                return -1;
            if(count %3 == 0)
                min_round += count/3;
            else
                min_round += count/3 +1;
        }
        return min_round;   
    }
}
