import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        int[][] connectArr = new int[n+1][n+1];
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i =0;i<wires.length;i++){
            connectArr[wires[i][0]][wires[i][1]]=1;
            connectArr[wires[i][1]][wires[i][0]]=1;
        }
   
        LinkedList<Integer> gap = new LinkedList<>();
        
        for(int i =0;i<wires.length;i++){
            int cnt=0;
            int[] visited = new int[n+1];
            Arrays.fill(visited, 0);
            
            connectArr[wires[i][0]][wires[i][1]]=0;
            connectArr[wires[i][1]][wires[i][0]]=0; // 음~ 
            queue.offer(wires[i][0]);
            visited[wires[i][0]] = 1;
                  
            while(!queue.isEmpty()){
                int m = queue.poll();
                
                visited[m] =1;
                for(int j = 1;j<=n;j++){
                   if(visited[j]==0 && (connectArr[m][j]==1||connectArr[j][m]==1)){
                        queue.offer(j);
                        visited[j]=1;
                   }
                }
                cnt++;
            }
                
            //// 원상복귀 ///
            connectArr[wires[i][0]][wires[i][1]]=1;
            gap.add( Math.abs(cnt-(n-cnt)));
        }
        
        answer = Collections.min(gap);
        
        return answer;
    }
}