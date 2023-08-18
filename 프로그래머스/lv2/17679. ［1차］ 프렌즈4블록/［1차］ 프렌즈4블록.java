import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        String[][] boardMap = new String[m][n];
        
        String[] boardTmp = new String[n];
       
        for(int i =0;i<m;i++){
            boardTmp = board[i].split("");
            for(int j =0;j<boardTmp.length;j++){
                boardMap[i][j] = boardTmp[j];
            }
        }
        
        //mapPrint(boardMap);
        
        int check =  Bomb(boardMap);
   
        
        while(check!=0){
            check = Bomb(boardMap);
            
        }
        
        for(int i =0;i<boardMap.length;i++){
            for(int j =0;j<boardMap[0].length;j++){
                if(boardMap[i][j].equals("x"))
                    answer++;
            }
        }

        
        return answer;
    }
    
    public void mapPrint(String[][] boardMap){
        for(int i =0;i<boardMap.length;i++){
            for(int j =0;j<boardMap[0].length;j++){
                System.out.print(boardMap[i][j]);
            }
            System.out.println();
        }
         System.out.println();
    }
    
    public int Bomb(String[][] boardMap){
        Stack<int[]> stack = new Stack<>();
        int cnt=0;
        //int[] arr = new int[2];
        
        for(int i=0;i<boardMap.length-1;i++){
            for(int j =0;j<boardMap[0].length-1;j++){
  
                if(!boardMap[i][j].equals("x")){
                    if(boardMap[i][j].equals(boardMap[i+1][j])&&boardMap[i][j].equals(boardMap[i][j+1])&&boardMap[i][j].equals(boardMap[i+1][j+1]))
                    {
                       
                     stack.add(new int[]{i, j});   
                    cnt++;
                    }
                }
            }
        }
        // while(!stack.isEmpty()){
        //     int[] topArr = stack.pop();
        //     System.out.println(topArr[0]+", "+topArr[1]);
        // }
        
        if(cnt==0)
            return cnt;
        
        while(!stack.isEmpty()){
            int[] topArr = stack.pop();
            boardMap[topArr[0]][topArr[1]] = "x";
            boardMap[topArr[0]+1][topArr[1]] = "x";
            boardMap[topArr[0]][topArr[1]+1] = "x";
            boardMap[topArr[0]+1][topArr[1]+1] = "x";
        }
        
         //mapPrint(boardMap);
        
        String tmp="";
        for(int i=0;i<boardMap.length;i++){
            for(int j =0;j<boardMap.length;j++){
                if(boardMap[i][j].equals("x")){
                    int k =i-1;
                    while(k>=0){
                        boardMap[k+1][j] = boardMap[k][j];
                        boardMap[k][j]="x";
                        k--;
                    }
                }
            }
        }
        
        //mapPrint(boardMap);
        
        return cnt;
        
    }
}