import java.util.*;
class Solution {
    static int ROW;
    static int COL;
   List<Integer> result = new ArrayList<>();
     static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int[] solution(String[] maps) {
        ROW = maps.length;
        COL = maps[0].length();
        
        int[][] map = new int[ROW][COL];
        String[] rowTmp = new String[COL];
        
        int cnt=0;
        for(int i = 0;i<ROW;i++){
            rowTmp = maps[i].split("");
            for(int j=0;j<COL;j++){
                if(rowTmp[j].equals("X")){
                    map[i][j]=0;
                    cnt++;
                }else{
                    map[i][j]=Integer.valueOf(rowTmp[j]);
                }
                
            }
        }
        
    
        if(cnt == ROW * COL){
            int[] answer = {-1};
          
            return answer;
        }
        ////
         int[] answer = {};    
         //////////
        boolean[][] visited= new boolean[ROW][COL];
   
        
         for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (map[i][j] != 0 && !visited[i][j]) {
                    result.add(island(map, visited, i, j));
                }
            }
        }
        
        
        
         
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
         answer = result.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    
    public int island(int[][] map, boolean[][] visited, int row, int col ){
         if (row < 0 || row >= ROW || col < 0 || col >= COL || visited[row][col] || map[row][col] == 0) {
            return 0;
        }
        
        visited[row][col] = true;
        int sum = map[row][col];
        
        for (int[] dir : directions) {
            sum += island(map, visited, row + dir[0], col + dir[1]);
        }
        
        return sum;
        
    }
    
    
    
}