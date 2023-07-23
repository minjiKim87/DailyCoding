class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] cnt = new int[m+1][n+1];
        cnt[1][1]=1; // 집
        
        for(int i =0 ;i<puddles.length;i++){ // 못가는 물웅덩이 표시
            cnt[puddles[i][0]][puddles[i][1]]=-1;
        }
        
        
        for(int i=1; i<m+1;i++){
            for(int j =1;j<n+1;j++){
                if(cnt[i][j]!=-1){
                    if(cnt[i-1][j]!=-1)
                        cnt[i][j] += cnt[i-1][j];
                    if(cnt[i][j-1]!=-1)
                        cnt[i][j]+=cnt[i][j-1];
                    cnt[i][j]= cnt[i][j]%1000000007;
                    //System.out.println(cnt[i][j]);
                }
            }
        }
        return cnt[m][n];
    }
    
    
}