
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
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int M = sc.nextInt();
            
           sc.nextLine();
            
             String[] s = sc.nextLine().split(" ");
            String[] t =  sc.nextLine().split(" ");
                
          //  testArr(s);
           // testArr(t);
            
            int Q = sc.nextInt();
           // int[] y = new int[Q];
            StringBuilder sb = new StringBuilder();
            
            for(int i =0;i<Q;i++){
              //  y[i] = sc.nextInt();
                
                int y = sc.nextInt();
                
              //  System.out.println("y"+y+" "+y%N+","+y%M);
                int n = y%N;
                int m = y%M;
                
                if(n==0){
                 n = s.length-1;   
                }else{
                    n--;
                }
                if(m==0){
                 m = t.length-1;   
                }else{
                    m--;
                }
                
                String curr = s[n]+t[m];
                //System.out.println(curr);
                
                sb.append(" "+curr);
            }
            
            System.out.println("#"+test_case+sb.toString());

		}
	}
    
    public static void testArr(String[] arr){
        System.out.println("------");
        System.out.println(Arrays.toString(arr));
    }
}