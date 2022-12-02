class Solution {
     public class Node{
        int index1;
        int index2;
       
        public Node(int i,int j){
            index1=i;
            index2=j;
        }
    }
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Stack<Node> stack = new Stack<>();
        int color = image[sr][sc];
        if(color != newColor){
            stack.add(new Node(sr,sc));
            while(!stack.isEmpty()){
                Node n = stack.pop();
                 if (image[n.index1][n.index2] == color) {
                    image[n.index1][n.index2] = newColor;
                    if(n.index1>=1 )stack.add(new Node(n.index1-1,n.index2));
                    if(n.index2>=1 )stack.add(new Node(n.index1,n.index2-1));
                    if(n.index1+1 <image.length )stack.add(new Node(n.index1+1,n.index2));
                    if(n.index2+1 < image[0].length )stack.add(new Node(n.index1,n.index2+1));
                 }
            }
        }
        return image;
    }
}
