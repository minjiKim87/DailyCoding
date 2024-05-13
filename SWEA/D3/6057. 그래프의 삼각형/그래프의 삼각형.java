import java.util.*;
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
            int M = sc.nextInt();
            int[][] map = new int[N][N];
            
            int x = 0;
            int y = 0;
            
            for(int i =0;i<M;i++){
                x = sc.nextInt()-1;
                y = sc.nextInt()-1;
                
                map[x][y] = 1;
               map[y][x]=1;
                
            }
            int answer = 0;
            for(int i =0;i<N;i++){
             for(int j =i+1;j<N;j++){
              if(map[i][j] ==1){
               for(int k = j+1;k<N;k++){
                  	if(map[j][k]==1 && map[k][i]==1){
                        answer++;
                    }
               }
              }
                 
             }
            }
            
            System.out.println("#"+test_case +" "+answer);
	 
		}
	}
}