import java.io.*;
import java.util.*;

class info{
    int row;
    int col;


    info(int row, int col){
        this.row = row;
        this.col = col;
    }
}

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));

       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       String[][] map = new String[N][M];
       boolean[][] visited = new boolean[N][M];

       int startX = 0;
       int startY = 0;
       for(int i =0;i<N;i++){
        String str = br.readLine();
        map[i] = str.split("");
        if(str.contains("I")){
            startX = i;
            startY = str.indexOf("I");
        }
       }

       //System.out.println(startX +". "+startY);

       Queue<info> q = new LinkedList<>();
       q.offer(new info(startX, startY));
       visited[startX][startY] = true;
       int[][] direction = {{-1, 0},{1, 0},{0, -1},{0, 1}};
       
       int answer = 0;
       while(!q.isEmpty()){
        info info = q.poll();
   
        for(int i =-0;i<4;i++){
            int newR = info.row+direction[i][0];
            int newC = info.col+direction[i][1];

            if(newR>=0&&newR<N&&newC>=0&&newC<M && !visited[newR][newC]){
                if(map[newR][newC].equals("P")){
                    answer++;
                }
                
                if(!map[newR][newC].equals("X")){
                    q.offer(new info(newR, newC));
                    visited[newR][newC] = true;
                }
            }
        }
        
       }
       
       
       System.out.println(answer == 0? "TT" : answer);
      
       br.close();
        
    }
    
    
}

