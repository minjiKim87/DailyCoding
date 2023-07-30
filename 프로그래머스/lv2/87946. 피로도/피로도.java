import java.util.*;

class Solution {
     static int answer = -1;
    public int solution(int k, int[][] dungeons) {
      
        int num = dungeons.length;
        System.out.println(num);
        int[] arr = new int[num];
        int[] output = new int[num];
        boolean visited[] = new boolean[num];
        
        for(int i=0;i<dungeons.length;i++){
            if(k>=dungeons[i][0]){
                visited[i] = true;
                dfs(dungeons, visited, k-dungeons[i][1], 1);
                visited[i] = false;
            }
        }
        System.out.println(answer);

        return answer;
    }
    
    public static void dfs(int[][] dungeons, boolean[] visited, int remaining, int count){
        answer = Math.max(answer, count);
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i]&&remaining>=dungeons[i][0]){
                visited[i]=true;
                dfs(dungeons, visited, remaining-dungeons[i][1], count+1);
                visited[i] = false;
            }
        }
    }

    
}