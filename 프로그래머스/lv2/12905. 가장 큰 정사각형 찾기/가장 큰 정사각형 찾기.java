class Solution
{   static int ROW;
    static int COL;
   
    public int solution(int [][]board)
    {
        int answer = 0;
        ROW = board.length;
        COL = board[0].length;
        
        int maxSide=0;
       
        for(int i =0;i<ROW;i++){
            for(int j =0;j<COL;j++){
                if(board[i][j]==1){
                    if(i==0||j==0||board[i][j]==0){
                        maxSide = Math.max(maxSide, board[i][j]);
                        continue;
                    }
                    
                board[i][j] = Math.min(board[i-1][j-1], Math.min(board[i-1][j], board[i][j-1])) + 1;
                maxSide = Math.max(maxSide, board[i][j]);
                    
                }
            }
        }
        answer = maxSide*maxSide;
        return answer;
    }

}