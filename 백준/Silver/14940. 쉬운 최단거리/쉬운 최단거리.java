import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
        
       int[][] map = new int[N][M];
       int[][] visit = new int[N][M];
       for(int i =0;i<N;i++){
        Arrays.fill(visit[i], -1);
       }
       Queue<int[]> q = new LinkedList<>();
       int goalR = 0;
       int goalC =0;
       for(int i =0;i<N;i++){
        st = new StringTokenizer(br.readLine());
        for(int j =0;j<M;j++){
            map[i][j] = Integer.parseInt(st.nextToken());

            if(map[i][j]==2){
                goalR = i;
                goalC = j;
            }
        }
       }

       visit[goalR][goalC]=0;
       q.offer(new int[]{goalR, goalC});

       while(!q.isEmpty()){
        int[] curr = q.poll();

        for(int i =0;i<4;i++){
            int newR = curr[0] + direction[i][0];
            int newC = curr[1] + direction[i][1];

            

            if(newR>=0&&newR<N&&newC>=0&&newC<M&&visit[newR][newC]==-1&&map[newR][newC]==1){
                 visit[newR][newC] = visit[curr[0]][curr[1]]+1;
                q.offer(new int[]{newR, newC});
               
            }
        }
       }
       
 

       for(int i = 0; i < N; i++) {
        for(int j = 0; j < M; j++) {
            if (visit[i][j] == -1 && map[i][j] == 1) {
                sb.append(-1).append(" ");
            } else if(map[i][j] == 0) {
                sb.append(0).append(" ");
            } else {
                sb.append(visit[i][j]).append(" ");
            }
        }
        sb.append("\n");
    }

    System.out.print(sb.toString());
       br.close();
        
    }
    
    
}

