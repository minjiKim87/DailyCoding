import java.io.*;
import java.util.*;

public class Main{
    static boolean[] visited;
    static int[][] map;
    static Queue<Integer> q;

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

       map = new int[N][N];
       visited = new boolean[N];

       for(int i =0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u =  Integer.parseInt(st.nextToken());
            int v =  Integer.parseInt(st.nextToken());
            u--;
            v--;
            map[u][v]=1;
            map[v][u]=1;
       }

       int cnt=0;

       for(int i =0;i<N;i++){
        
            if(visited[i]==false){
                bfs(i);
                cnt++;
            }
        
       }

       System.out.println(cnt);
      
       br.close();
        
    }
    
    static void bfs(int u){
        visited[u] = true;
        q = new LinkedList<>();
        q.add(u);

        while(!q.isEmpty()){
            int curr = q.poll();

            for(int i =0;i<map.length;i++){
                if(map[curr][i] ==1 && visited[i] ==false){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }

    }
    
}

