class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length -1;
        while(low<= high){
           int middle = low + (high - low)/2;
           if(nums[middle] == target) return middle;
           if(nums[middle]<target) low = middle + 1;
           else high = middle -1 ;
        } 
        return low;
    }
}
