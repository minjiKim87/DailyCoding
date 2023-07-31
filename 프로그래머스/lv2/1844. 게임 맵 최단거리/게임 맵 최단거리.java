import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int x;
    int y;
    
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    int ROW = 0;
    int COL = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        ROW = maps.length;
        COL = maps[0].length;
        int[][] visited = new int[ROW][COL];
        
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(0,0));
        visited[0][0]=1;
        
        while(!q.isEmpty()){
           
            Pair pair = q.poll();
            int x = pair.x;
            int y = pair.y;
            
            if(x==maps.length-1&&y ==maps[0].length-1){
                break;
            }
           //  System.out.println("x: "+x+" y: "+y+" 거리: "+visited[x][y]);
            for(int i =0;i<4;i++){
                //상, 하, 좌, 우
                int row = x + dx[i];
                int col = y + dy[i];
                  if(!(row<0 || row >= ROW || col<0 || col>=COL)){           
                      
                    if(maps[row][col]!=0 &&visited[row][col]==0){
                       // System.out.println(row+", "+col);   
                        q.offer(new Pair(row, col));
                        visited[row][col] = visited[x][y]+1;
                  }
                }

            }
        }
        
        if(visited[maps.length-1][maps[0].length-1]==0)
            answer = -1;
        else
            answer =  visited[maps.length - 1][maps[0].length - 1];
    
        
        return answer;
    }
    
    
    
    
}