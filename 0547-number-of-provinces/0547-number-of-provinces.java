class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<isConnected.length;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j] == 1 && i != j){
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        
        boolean vis [] = new boolean[isConnected.length];
        int count = 0;
        
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                count++;
                dfs(i,list,vis);
            }
        }
        return count;
    }
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean [] vis){
        vis[node] = true;
        
        for(Integer it : adj.get(node)){
            if(!vis[it]){
                dfs(it, adj, vis );
            }
        }
    }
}