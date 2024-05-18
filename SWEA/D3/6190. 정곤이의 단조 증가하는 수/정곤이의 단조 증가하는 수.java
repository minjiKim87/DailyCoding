/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의

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
            int[] arr = new int[N];
            
            for(int i =0;i<N;i++){
             arr[i] = sc.nextInt();   
            }
            
            int max = -1; 
            for(int i =0;i<N-1;i++){
             for(int j=i+1;j<N;j++){
                 int n = arr[i]*arr[j];
                 int check = func(n);
                 if(max<=check){
                     max = check;
                 }
             }
            }
	
            System.out.println("#"+test_case+" "+max);

		}
        
     
	}
    
       public static int func(int n){
         String str = String.valueOf(n);
            
            for(int i =1;i<str.length();i++){
                if(str.charAt(i-1)>str.charAt(i)){
                 return -1;   
                }
            }
            
            return n;
            
        }
}