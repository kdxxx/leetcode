class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        boolean [] seen = new boolean[n];

        for(int [] edge: edges){
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a,val->new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b,val->new ArrayList<Integer>()).add(a);
        }
        return dfs(graph,seen,source,destination);
    }
    private boolean dfs(Map<Integer,List<Integer>> graph,boolean[] seen, int cur_node, int destination){
        if(cur_node == destination)
            return true;
        if(!seen[cur_node]){
            seen[cur_node] = true;
            for(int nextNode : graph.get(cur_node)){
                if(dfs(graph,seen,nextNode,destination)){
                    return true;
                }
            }
        }
        return false;
    }
}
