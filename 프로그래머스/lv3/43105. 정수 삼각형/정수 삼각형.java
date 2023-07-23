class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = new int[triangle.length][triangle[triangle.length-1].length]; // 크기 어느정도?
        
        dp[0][0] = triangle[0][0];
        
        for(int i =1;i<triangle.length;i++){
        dp[i][0] = dp[i-1][0] +  triangle[i][0];
        dp[i][i] = dp[i-1][i-1] +  triangle[i][i];
        for(int j = 1;j<=i-1;j++){
            dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+ triangle[i][j];
            answer = Math.max(answer, dp[i][j]);
           // System.out.println("answer : "+ answer + " dp[i][j] : "+dp[i][j]);
        }
        
        }
        
        
        return answer;
    }
}