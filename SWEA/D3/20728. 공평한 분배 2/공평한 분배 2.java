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
            int K = sc.nextInt();
            int[] candy = new int[N];
            int sum=0;
            
            for(int i =0;i<N;i++){
             candy[i] = sc.nextInt();   
             
            }
            Arrays.sort(candy);
            
            if(N==K){
             System.out.println("#"+test_case+" "+(candy[N-1]-candy[0]));
                continue;
            }
        //    System.out.println(Arrays.toString(candy));
            int min = Integer.MAX_VALUE;
            for(int i=0;i+K-1<N;i++){
         		int range = candy[i+K-1]-candy[i];
                 if(range<min){
                  min = range;   
                 }
             
                
            }
            
          
            
            System.out.println("#"+test_case+" "+ min);
		
			 

		}
	}
}