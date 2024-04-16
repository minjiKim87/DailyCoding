import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] dp = new int[len][triangle[len-1].length];
        
        dp[0][0]=triangle[0][0];
        
        for(int i =1;i<len;i++){
            for(int j=0;j<triangle[i].length;j++){
                if(j==0){//왼쪽 변
                    dp[i][j]+=dp[i-1][j]+triangle[i][j];
                }else if(j==triangle[i].length-1){//오른쪽 변
                    dp[i][j]+=dp[i-1][j-1]+triangle[i][j];
                }else{
                    dp[i][j] += Math.max(dp[i-1][j-1],dp[i-1][j])+triangle[i][j];
                }
            }
        }
        
        //print(dp);
        
        for(int a : dp[len-1]){
            answer = Math.max(answer, a);
        }
        
        return answer;
    }
    
    public void print(int[][] arr){
        for(int[]a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}