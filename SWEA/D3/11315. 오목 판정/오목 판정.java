import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int N = sc.nextInt();                   
            sc.nextLine();
            
         //   System.out.println(N);
            
             char[][] arr = new char[N][N];
             String answer = "NO";
   
            for(int i =0;i<N;i++){
                String str  = sc.nextLine();
   
                    arr[i] = str.toCharArray();
                
            }
            
            
            String col="";
            
            //가로
                for(int i =0;i<N;i++){
                col = "";
                for(int j =0;j<N;j++){
                 col+=arr[i][j];   
                }
                if(col.contains("ooooo")){
                     answer = "YES";
                    break;
                }
                   
            }
            
              if(answer.equals("YES")){
             System.out.println("#"+test_case+" " +answer);
              continue;
            }
            
            //세로
            
            for(int i =0;i<N;i++){
                col = "";
                for(int j =0;j<N;j++){
                 col+=arr[j][i];   
                }
                if(col.contains("ooooo")){
                     answer = "YES";
                    break;
                }
                   
            }
            
           if(answer.equals("YES")){
             System.out.println("#"+test_case+" " +answer);
              continue;
            }
            
            
       // 우하향 대각선 검사
for (int start = 0; start < N; start++) {
    col = "";
    for (int i = 0; start + i < N; i++) {
        col += arr[start + i][i];
    }
    if (col.contains("ooooo")) {
        answer = "YES";
        break;
    }
    col = "";
    for (int i = 0; start + i < N; i++) {
        col += arr[i][start + i];
    }
    if (col.contains("ooooo")) {
        answer = "YES";
        break;
    }
}

// 좌하향 대각선 검사
for (int start = 0; start < N; start++) {
    col = "";
    for (int i = 0; start + i < N; i++) {
        col += arr[start + i][N - 1 - i];
    }
    if (col.contains("ooooo")) {
        answer = "YES";
        break;
    }
    col = "";
    for (int i = 0; i + start < N; i++) {
        col += arr[i][N - 1 - (start + i)];
    }
    if (col.contains("ooooo")) {
        answer = "YES";
        break;
    }
}

            
             System.out.println("#"+test_case+" " +answer);
              

		}
	}
    
    
}