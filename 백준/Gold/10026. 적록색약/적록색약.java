import java.io.*;
import java.util.*;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N;
    static Queue<Point> q;

    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       N = Integer.parseInt(br.readLine());
        
       char[][] grid = new char[N][N];
  
       for(int i =0;i<N;i++){
        String line = br.readLine();
        for(int j =0;j<N;j++){
            grid[i][j] = line.charAt(j);
        }
       }

       int normalCount = countZones(grid, false);
       int colorBlindCount = countZones(grid, true);
       

       System.out.println(normalCount + " " + colorBlindCount);
       
       br.close();

    }

    public static int countZones(char[][] grid, boolean isColorBlind){
        boolean[][] visited = new boolean[N][N];
        int count =0;

        for(int i =0;i<N;i++){
            for(int j =0;j<N;j++){
                if(!visited[i][j]){
                    bfs(grid, visited, i, j, isColorBlind);
                    count++;
                }
            }
        }

        return count;
    }

    public static void bfs(char[][] grid, boolean[][] visited, int x, int y, boolean isColorBlind) {{
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        visited[x][y] = true;
        char color = grid[x][y];

        while(!queue.isEmpty()){
            Point current = queue.poll();

            for(int[] direction : directions){
                int newX = current.x + direction[0];
                int newY = current.y + direction[1];

                if(newX>=0 && newX <N && newY >= 0 && newY<N && !visited[newX][newY]){
                    if(isColorBlind && (color =='R'||color=='G')){
                        if (grid[newX][newY] == 'R' || grid[newX][newY] == 'G') {
                        queue.add(new Point(newX, newY));
                        visited[newX][newY] = true;
                        }
                    }
                    else{
                    if(grid[newX][newY]==color){
                        queue.add(new Point(newX, newY));
                        visited[newX][newY] = true;
                    }
                }
            }
            }
        }
    }

    }
}