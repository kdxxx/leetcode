class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length < 1)
            return;
        
        int first = 0;
        int second = 0;
        while(first<nums.length && second<nums.length){
            while(first<nums.length && nums[first] != 0)
                first++;
            second = first + 1;
            while(second<nums.length && nums[second] == 0)
                second++;
            if(first<nums.length && second < nums.length)
                swap(nums,first++,second++);
        }
    }
    public void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
