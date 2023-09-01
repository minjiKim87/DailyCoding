
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] board = new int[n];
       
        answer = solve(board, 0, n);
        
        
        return answer;
    }
    
    public int solve(int[] board, int row, int n){
        if(row==n)
            return 1;
        
        int cnt = 0;
        for(int col =0;col<n;col++){
            if(isSafe(board, row, col)){
                board[row] = col;
                cnt+=solve(board, row+1, n);
            }
        }
        return cnt;
    
    }
    
    public boolean isSafe(int[] board, int row, int col){
        for(int i =0;i<row;i++){
            if(board[i]==col || Math.abs(row-i)==Math.abs(col - board[i])) {
                return false;
            }
        }
        
        return true;
    }
}