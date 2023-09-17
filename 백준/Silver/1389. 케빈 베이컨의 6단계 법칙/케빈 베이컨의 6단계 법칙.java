import java.io.*;
import java.util.*;

public class Main{
    static int[] visited;
    static int[][] map;
    static int N;

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        visited = new int[N];
   
        for(int i =0;i<M;i++){
            st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
            a--;
            b--;

            map[a][b] = 1;
            map[b][a] = 1;
        }

      

        int answer = 0;
        int min = Integer.MAX_VALUE;
        for(int i =N-1;i>=0;i--){
            
            int bfs  = bfs(i);
  
            if(bfs<=min){
                min = bfs;
                answer = i;
            };
        }
      
        System.out.println(answer+1);
       br.close();
        
    }
    
    static int bfs(int p){
        Queue<Integer> q = new LinkedList<>();

     
        q.offer(p);
        Arrays.fill(visited, 0);
        visited[p]=1;
        int cnt =  0;

        while(!q.isEmpty()){
            int curr = q.poll();
   
            for(int i =0;i<N;i++){
                if(visited[i]==0&&map[curr][i]==1){
                    q.offer(i);
                    visited[i] = visited[curr]+1;
                }
            }
            
        }

        for(int v : visited){
            cnt+=(v-1);
        }
        
        return cnt;
    }
    
}

