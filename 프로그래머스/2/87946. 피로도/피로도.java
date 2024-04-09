import java.util.*;

class Solution {
     boolean[] visited; //static 안붙이면 어떻게 되지
    int maxCount=0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        visited = new boolean[dungeons.length];
        answer = dfs(k, dungeons, 0);
        
        return answer;
    }
    
    public int dfs(int curr, int[][] dungeons, int cnt){
       
        
        for(int i =0;i<dungeons.length;i++){
                  
            if(!visited[i]&&curr>=dungeons[i][0]){
              
                visited[i]=true;
                dfs(curr-dungeons[i][1], dungeons, cnt+1);
                visited[i]=false;
            }else{
                 maxCount = Math.max(maxCount, cnt);
            }
        }
        
        return maxCount;
        
    }
}