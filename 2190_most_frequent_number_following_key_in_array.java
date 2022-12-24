class Solution {
    public int mostFrequent(int[] nums, int key) {
        int [] counter = new int [1001];
        for(int i= 0; i<nums.length; i++)
            if(nums[i] == key && (i<nums.length -1 ))
                counter[nums[i+1]]++; 

        
        int max = counter[0];
        int result = 0;
        for(int i = 0;i<counter.length; i++)
            if(max<counter[i]){
                max = counter[i];
                result = i;
            }
        return result;
    }
}
