import java.io.*;
import java.util.*;


    class cab{
        int x;
        int y;

        cab(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

public class Main{
    static int[][] direction={{-1, 0},{1, 0},{0, -1},{0, 1}};
    static int ROW;
    static int COL;
    static boolean[][] visited;
    static Queue<cab> q;
    static int[][] map;

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
      
       int T = Integer.parseInt(br.readLine());

       for(int t=0;t<T;t++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            COL = Integer.parseInt(st.nextToken());
            ROW = Integer.parseInt(st.nextToken());
            visited = new boolean[ROW][COL];
            map = new int[ROW][COL];

            int K = Integer.parseInt(st.nextToken());

            int r=0; int c =0;
        
            for(int i=0;i<K;i++){
                    
                    st = new StringTokenizer(br.readLine());
                    c = Integer.parseInt(st.nextToken());
                    r = Integer.parseInt(st.nextToken());

                    map[r][c] = 1;
                
            }

            
            int count=0;
       
            for(int i=0;i<ROW;i++){
                for(int j =0;j<COL;j++){
                    if(map[i][j]==1 && visited[i][j]==false){
                        bfs(i, j);
                        count++;
                    }
                }
            }
        

            System.out.println(count);
       
       }
     
         br.close();

    }

    static void bfs(int x, int y){
        q = new LinkedList<cab>();
        q.offer(new cab(x, y));
     

        visited[x][y] = true;


        while(!q.isEmpty()){
        cab cab = q.poll();

        for(int i =0;i<4;i++){
            int newR = cab.x+direction[i][0];
            int newC = cab.y + direction[i][1];

            if(newR>=0 && newR<ROW&&newC>=0&&newC<COL){
                if(visited[newR][newC]==false && map[newR][newC]==1){
                    q.add(new cab(newR, newC));
                    visited[newR][newC] = true;
                    
                }
            }

        }
       }
      

    }
    
    
}

