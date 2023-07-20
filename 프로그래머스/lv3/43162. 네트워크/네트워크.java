class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i = 0;i<n;i++){
            if(visited[i]==false){
                dfs(i, computers, visited);
                answer++;
            }      
        }
     
        return answer;
    }
    
    boolean[] dfs(int i, int[][] computers, boolean[] visited){
       visited[i]=true;
        
        for(int j =0; j<computers.length;j++){
            if(i!=j && computers[i][j]==1 && visited[j]==false){
                visited = dfs(j, computers, visited);
            }            
        }
        
        return visited;
    }
}