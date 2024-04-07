import java.util.*;

class Point{
    int r;
    int c;
    int cnt;
    
    public Point(int r, int c, int cnt){
        this.r = r;
        this.c = c;
        this.cnt = cnt;
    }
}

class Solution {
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int ROW;
    static int COL;
    static int GoalR;
    static int GoalC;
    static boolean[][] visited;
    
    public int solution(int[][] maps) {
        int answer = 0;
        ROW = maps.length;
        COL = maps[0].length;
        visited = new boolean[ROW][COL];
        GoalR = ROW-1;
        GoalC = COL-1;
        
        answer = BFS(maps);
        
        return answer;
    }
    
    public int BFS(int[][] maps){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0, 1));
        
        while(!queue.isEmpty()){
            Point p = queue.poll();
      
            if(p.r==GoalR && p.c == GoalC){
                return p.cnt;
          
            }
            
            for(int i =0;i<4;i++){
               int nextR = p.r + dir[i][0];  
            int nextC = p.c + dir[i][1];
                
                if(nextR>=0&&nextR<ROW&&nextC>=0&&nextC<COL){
                    if(!visited[nextR][nextC]&&maps[nextR][nextC]==1){
                        queue.offer(new Point(nextR, nextC, p.cnt+1));
                        visited[nextR][nextC] = true;
                    }
                }
            }
        }
        
      
        return -1;
    }
}