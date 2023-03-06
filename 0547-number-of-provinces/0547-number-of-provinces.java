class Solution {
public static   void dfs(int graph[][],int i){
        graph[i][i] = 0;
        for(int j = 0;j< graph.length;j++){
            if(graph[i][j]==1){
                graph[i][j] = 0;
                dfs(graph,j);
            }
        }
    }

    static int findCircleNum(int[][] graph){
        int ans = 0;
        int n = graph.length;

        for(int i = 0;i<n;i++){

                if(graph[i][i]==0){
                    continue;
                }
                ans++;
                dfs(graph,i);
        }
        return ans;
    }
}