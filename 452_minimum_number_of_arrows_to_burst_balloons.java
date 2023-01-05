class Solution {
    public int findMinArrowShots(int[][] points) {
        // sort the ballons by the end position of the arrow
        Arrays.sort(points , (a,b) -> Integer.compare(a[1],b[1]));

        int arrow = 1;
        // set the index of the previously burst balloon to 0
        int previous = 0;

        for(int current=1; current<points.length; current++)
        // if the start position of the current balloon is after the end position of the arrow that burst the previous balloon then a new arrow is needed to burst the current balloon.
            if(points[current][0] > points[previous][1]){
                arrow++;
                previous = current;
            }
        return arrow;
    }
}
