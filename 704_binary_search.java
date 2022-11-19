class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        return binarySearch(nums,target,0,(nums.length-1));
    }
    public int binarySearch(int [] nums, int target, int low, int high){
        int middle = low + (high - low)/2;
        if(high>=low){
              if(target == nums[middle]){
            return middle;
        } 
        else if(nums[middle]>target){
            return binarySearch(nums,target,low,middle-1);
        } 
        else{
            return binarySearch(nums,target,middle+1,high);
        }
        }
        return -1;
    }
}
