import java.util.*;

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    
    public int[] solution(int rows, int columns, int[][] queries) {

        int[][] board = new int[rows][columns];
       int index = 1;
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
                board[i][j] = index;
                index++;
            }
        }
        
        for(int i =0;i<queries.length;i++){
            rotation(queries[i], board);
        }
        
       //Collections.sort(list);
       int[] answer = list.stream().mapToInt(i->i).toArray();
        
        
        return answer;
    }
    
    public void rotation(int[] coordinate, int[][] board){
        int startX = coordinate[0]-1;
        int startY = coordinate[1]-1;
        int endX = coordinate[2]-1;
        int endY = coordinate[3]-1;
        
        int minVal = Integer.MAX_VALUE;

        int temp = board[startX][startY];

        // Move left side
        for(int i = startX; i < endX; i++) {
            board[i][startY] = board[i+1][startY];
            minVal = Math.min(minVal, board[i][startY]);
        }

        // Move top side
        for(int j = startY; j < endY; j++) {
            board[endX][j] = board[endX][j+1];
            minVal = Math.min(minVal, board[endX][j]);
        }

        // Move right side
        for(int i = endX; i > startX; i--) {
            board[i][endY] = board[i-1][endY];
            minVal = Math.min(minVal, board[i][endY]);
        }

        // Move bottom side
        for(int j = endY; j > startY; j--) {
            board[startX][j] = board[startX][j-1];
            minVal = Math.min(minVal, board[startX][j]);
        }

        board[startX][startY+1] = temp;
        minVal = Math.min(minVal, temp);

        list.add(minVal);
        
        
        

    }
}