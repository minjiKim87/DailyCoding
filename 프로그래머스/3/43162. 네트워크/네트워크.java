import java.util.*;

class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        
        for(int i =0;i<n;i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(computers, i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int[][] computers, int node){
        for(int i =0;i<computers.length;i++){
            if(!visited[i]&&computers[node][i]==1){
                 visited[i]=true;
                dfs(computers, i);
            }
        }
    }
}