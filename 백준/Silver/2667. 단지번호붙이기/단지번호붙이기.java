import java.io.*;
import java.util.*;

public class Main{
    static boolean[][] visited;
    static  int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int T;
    static int[][] map;

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       T = Integer.valueOf(br.readLine());
       map = new int[T][T];
      
       for(int i=0;i<T;i++){
        String[] str = br.readLine().split("");

        for(int j =0;j<str.length;j++){
            map[i][j] = Integer.valueOf(str[j]);
       
        }
       }

       

       visited = new boolean[T][T];

       ArrayList<Integer> list = new ArrayList<>();
       for(int i =0;i<T;i++){
        for(int j =0;j<T;j++){
            if(map[i][j]==1 && visited[i][j]==false){
                list.add(bfs(i, j));
                
            }
        }
       }

       Collections.sort(list);
       
       System.out.println(list.size());
       for(Integer i : list){
        System.out.println(i);
       }
    
       br.close();
        
    }

       static int bfs(int r, int c){
    
        int result = 1;
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{r, c});
        visited[r][c]=true;

        while(!q.isEmpty()){
            int[] curr = q.poll();

            for(int i =0;i<4;i++){
                int newR = curr[0]+direction[i][0];
                int newC = curr[1]+direction[i][1];

                if(newR>=0&&newR<T&&newC>=0&&newC<T&&visited[newR][newC]==false && map[newR][newC]==1){
                    q.offer(new int[]{newR, newC});
                    visited[newR][newC] = true;
                    result++;
                }
            }
        }
        
        return result;
       }





    
    
}

