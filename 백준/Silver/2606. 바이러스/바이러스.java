import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
    
       int N = Integer.parseInt(br.readLine());
       int M = Integer.parseInt(br.readLine());

       int[][] map = new int[N][N];
       
       for(int i =0;i<M;i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        a--;
        b--;
        map[a][b] = 1;
        map[b][a] = 1;
       }

       Queue<Integer> q = new LinkedList<>();
       boolean[] visited = new boolean[N];
       Arrays.fill(visited, false);
        q.offer(0);
       visited[0] = true;

       while(!q.isEmpty()){
            int n = q.poll();

            for(int i =0;i<N;i++){
                if(visited[i]==false &&(map[n][i]==1 || map[i][n]==1)){
                    q.offer(i);
                    visited[i]=true;
                }
            }
       }

       int answer=0;
       for(boolean v : visited){
        if(v)
            answer++;
       }


       System.out.println(answer-1);
       br.close();
        
    }
    
    
}

