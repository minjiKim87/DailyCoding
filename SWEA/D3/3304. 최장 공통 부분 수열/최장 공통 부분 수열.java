import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            int m = str1.length();
            int n = str2.length();
            
            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();
            int[][] map = new int[m+1][n+1];
            
            for(int i =1;i<=m;i++){
             for(int j =1;j<=n;j++){
                 if(i==0 || j ==0){
                     map[i][j] =0;
                 }
                 else if(charArr1[i-1]==charArr2[j-1]){
                 map[i][j] = map[i-1][j-1]+1;
                 }else{
                  map[i][j] = Math.max(map[i-1][j], map[i][j-1]);   
                 }
                 
             }
                
            }
             System.out.println("#"+test_case+" "+map[m][n]);  
            
        }
    }
}
