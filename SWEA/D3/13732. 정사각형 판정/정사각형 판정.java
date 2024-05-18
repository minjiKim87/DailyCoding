/////
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
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
            String[][] str = new String[N][N];
            boolean answer = true;
            
            for(int i =0;i<N;i++){
             str[i] = sc.nextLine().split("");
             //   System.out.println(Arrays.toString(str[i]));
            }
            ArrayList<Integer> x = new ArrayList<>();
              ArrayList<Integer> y = new ArrayList<>();
      
           for(int i = 0;i<N;i++){
            for(int j =0;j<N;j++){
                if(str[i][j].equals("#")){
                 x.add(i);
                    y.add(j);
                }
                
            }
           }
            Collections.sort(x);
            Collections.sort(y);
            
            int minX = x.get(0);
            int maxX=x.get(x.size()-1);
           int minY = y.get(0);
            int maxY =y.get(y.size()-1);
            
          //  System.out.println(minX+" "+maxX+" "+minY+" "+maxY);
            
            for(int i =minX;i<=maxX;i++){
                for(int j = minY;j<=maxY;j++){
                 if(!str[i][j].equals("#")){
                  answer = false;
                     break;
                 }
                     
                }
            }
            
            if(maxX-minX!=maxY-minY)
                answer = false;
            
              System.out.println("#"+test_case+" "+(answer? "yes":"no"));

		}
                   
                 
	}
}