import java.util.*;

class Solution {
    static int ROW;
    static int COL;
     int startX = 0;
        int startY = 0;
        
    static int GX;
    static int GY;
    static int[][] direction = {{-1, 0}, {1, 0},{0, -1},{0, 1}};
    static Queue<int[]> queue = new LinkedList<>();
    
    public int solution(String[] board) {
        int answer = 0;
        ROW = board.length;
        COL = board[0].length();
        
        char[][] charBoard = new char[ROW][COL];
  
       
        for(int i = 0; i < board.length; i++) {
            for(int j =0;j<board[0].length();j++){
                charBoard[i][j] = board[i].charAt(j);

                if(charBoard[i][j]=='R'){
                    startX = i;
                    startY = j;
                }else if(charBoard[i][j]=='G'){
                    GX = i;
                    GY = j;
                }
            }
        }
            boolean[][] visited = new boolean[ROW][COL];
            for(boolean[] v: visited)
                Arrays.fill(v, false);

           // System.out.println("G : "+GX+", "+GY);

           queue.add(new int[]{startX, startY, 0});      
            visited[startX][startY]=true;
        
            answer = bfs(charBoard, visited, startX, startY);
        
        return answer;
    }
    
    public int bfs(char[][] charBoard, boolean[][] visited, int row, int col){    
        
        while(!queue.isEmpty()){          
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];
            int distance = point[2];

            //System.out.println("Current Position: " + x + ", " + y + " with distance: " + distance);

            if(x == GX && y == GY){
                //System.out.println("Reached goal at " + x + ", " + y);
                return distance;
            }

            for(int i = 0; i < 4; i++){
                int movedX = x;
                int movedY = y;
             
                while(true){
                     if(movedX<0 || movedX>=ROW || movedY<0 || movedY>=COL)
                        break;
                    
                    if(charBoard[movedX][movedY]=='D'){
                        //장애물이면 한칸 뒤로 물러나면 됨~ 
                        movedX-=direction[i][0];
                        movedY-=direction[i][1];
                       
                        break;
                    }
                    
                    movedX += direction[i][0];
                    movedY += direction[i][1];
                      
                }
                
                if(movedX<0 || movedX>=ROW || movedY<0 || movedY>=COL){
                    if(i==0){
                        movedX = 0;
                    }else if(i==1){
                        movedX = charBoard.length-1;
                    }else if(i==2){
                        movedY =0;
                    }else{
                        movedY = charBoard[0].length-1;
                    }
                }
                
                
                
                if(charBoard[movedX][movedY]=='G'){
                    return distance+1;
                }
                
                if(!visited[movedX][movedY]){
                     queue.add(new int[]{movedX, movedY, distance+1});
                    visited[movedX][movedY]=true;
                }
                
                

            
            
            }
        
        }
        
        return -1;
    }
}

