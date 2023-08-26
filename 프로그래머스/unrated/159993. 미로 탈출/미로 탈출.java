import java.util.*;
class Solution {
    static int[][] direction = {{-1, 0}, {1, 0},{0, -1},{0, 1}};//상하좌우
    public int solution(String[] maps) {
        int answer = 0;
        
        int startX=0;
        int startY=0;
        int leverLength=0;
        int leverX=0;
        int leverY=0;
        int endLength=0;
        int endX=0;
        int endY=0;
        
        for(int i =0;i<maps.length;i++){
            for(int j =0;j<maps[i].length();j++){
                switch(maps[i].charAt(j)){
                    case 'S':
                        startX=i;
                        startY=j;
                        break;
                    case 'L' :
                        leverX=i;
                        leverY=j;
                        break;
                    case 'E' :
                        endX =i;
                        endY=j;
                        break;
                    default : 
                        break;
                }
                    
            }
        }
        
        leverLength = bfs(maps, startX, startY, leverX, leverY);
        if(leverLength == -1){
            return -1;
        }
        
        endLength = bfs(maps, leverX, leverY, endX, endY);
        if(endLength == -1){
            return -1;
        }
        
        return leverLength + endLength;

    }
    
    public int bfs(String[] maps, int startX,int startY, int endX,int endY){
        Boolean[][] visited = new Boolean[maps.length][maps[0].length()];
        for(Boolean[] v : visited)
            Arrays.fill(v, false);
        
        Queue<int[]> queue = new LinkedList<>();
        int[] start = new int[]{startX, startY, 0};
        queue.add(start);
        visited[startX][startY] = true;
        
        while(!queue.isEmpty()){
            int[] point = queue.poll();
            
            int x = point[0];
            int y = point[1];
            int level = point[2];
            
            if(x != 0 && maps[x-1].charAt(y) != 'X' && !visited[x-1][y]) { 
                // 상
                if(x-1 == endX && y == endY) {
                    return level+1;
                }
                 int[] newPoint = new int[]{x-1, y, level+1};
                queue.add(newPoint);
                visited[x-1][y] = true;
            }
            if(x != maps.length-1 && maps[x+1].charAt(y) != 'X' && !visited[x+1][y]) {
                // 하
                if(x+1 == endX && y == endY) {
                    return level+1;
                }
                 int[] newPoint = new int[]{x+1, y, level+1};
                queue.add(newPoint);
                visited[x+1][y] = true;
            }
            if(y != 0 && maps[x].charAt(y-1) != 'X' && !visited[x][y-1]) {
                // 좌
                if(x == endX && y-1 == endY) {
                    return level+1;
                }
                 int[] newPoint = new int[]{x, y-1, level+1};
                queue.add(newPoint);
                visited[x][y-1] = true;
            }
            if(y != maps[0].length()-1 && maps[x].charAt(y+1) != 'X' && !visited[x][y+1]) {
                // 우
                if(x == endX && y+1 == endY) {
                    return level+1;
                }
                 int[] newPoint = new int[]{x, y+1, level+1};
                queue.add(newPoint);
                visited[x][y+1] = true;
            }
            
            
        }
      
        return -1;
    }
}