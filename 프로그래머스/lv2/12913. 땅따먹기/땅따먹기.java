import java.util.*;

class Pair{
    int first;
    int second;
    
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }  
}

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int memo[][] = new int[land.length][4];
 
        for(int i =0;i<4;i++){
            memo[0][i] = land[0][i];
            
        }

        for(int i =1 ;i<land.length;i++){
            for(int j =0;j<4;j++){
                memo[i][j] = land[i][j];
                
                if(j == 0){
                    memo[i][j]+=Math.max(Math.max(memo[i-1][j+1],memo[i-1][j+2]),memo[i-1][j+3]);
                }else if(j ==1){                    
                    memo[i][j]+= Math.max(Math.max(memo[i-1][j-1], memo[i-1][j+1]),memo[i-1][j+2]);
                }else if(j==2){
                    memo[i][j]+=Math.max(Math.max(memo[i-1][j-2], memo[i-1][j-1]), memo[i-1][j+1]);
                }else{
                     memo[i][j]+=Math.max(Math.max(memo[i-1][j-1],memo[i-1][j-2]),memo[i-1][j-3]);
                }
            }
        }
        
        // for(int i =0;i<land.length;i++){
        //     for(int j =0;j<4;j++){
        //         System.out.print(memo[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        for(int i = 0 ;i<4;i++){
            if(answer<memo[land.length-1][i])
                answer = memo[land.length-1][i];
        }


        return answer;
    }
}