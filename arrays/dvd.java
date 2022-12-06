DVD[] dvdCollection = new DVD[15];

DVD avengerDVD = new DVD("the avengers", 2012,"Joss Whedon");
dvdCollection[7]= avengerDVD;

System.out.println(dvdCollection[7]);


public class DVD{
  public String name;
  public int releaseYear;
  public String director;
  
  public DVD(String name, int releaseYear, String director){
    this.name=name;
    this.releaseYear=releaseYear;
    this.director=director;
  }
  
  public String toString(){
    return this.name + ", directed by " + this.director + " released in " + this.releaseyear;
  }
  
  
  
  // iterate through array
for (int square : squareNumbers) {
    //current value of square.
    System.out.println(square);}
}


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // keep track of how many 1's you've seen in a row.
        for (int i = 0; i < nums.length; i++) {
            int max= 0,count=0;
            for(int i= 0; i<nums.length;i++){
            if(nums[i]==0){
            if(max<count){
            max = count;
            }
            }
            else{
            count++;
            }
            }
            if(max<count){
            max = count;
            }
            return max;
        }
    }
}



class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int total = 0;
        for(int i : nums){
            count = 0;
            while(true){
                if(i<=0)
                    break;
                i/=10;
                count++;
            }
            count = count%2 == 0 ? 1: 0;
            total += count;
        }
        return total;
    }
}


class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length;i++)
            nums[i] = nums[i] * nums[i];
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
        return nums;
    }
}


