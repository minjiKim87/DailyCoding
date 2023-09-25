import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));

       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       
       int[][] map = new int[N][M];
       int[][] visited = new int[N][M];

       for(int i =0;i<N;i++){
        String[] str = br.readLine().split("");

        for(int j =0;j<str.length;j++){
            map[i][j] = Integer.valueOf(str[j]);
        }
        
       }

       int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
       Queue<int[]> q = new LinkedList<>();
       q.offer(new int[]{0, 0});
       visited[0][0] = 1;

       while(!q.isEmpty()){
        int[] curr = q.poll();

        for(int i =0;i<4;i++){
            int newR = curr[0]+direction[i][0];
            int newC = curr[1]+direction[i][1];

            if(newR>=0&&newR<N&&newC>=0&&newC<M&&visited[newR][newC]==0&&map[newR][newC]==1){
                q.offer(new int[]{newR, newC});
                visited[newR][newC]=visited[curr[0]][curr[1]]+1;
            }
        }
       }

       System.out.println(visited[N-1][M-1]);
      
       br.close();
        
    }
    
    
}

