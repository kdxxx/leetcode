class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] result = new int[nums.length];
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                result[counter++] = nums[i];
            }
        }
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 1){
                result[counter++] = nums[i];
            }
        }
        return result;
    }
} 
