class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int picker = 0;
        for(int i= 1; i<nums.length; i++){
            if(nums[i] != nums[picker]){
                nums[++picker] = nums[i];
            }
        }
        return picker+1;
    }
}
