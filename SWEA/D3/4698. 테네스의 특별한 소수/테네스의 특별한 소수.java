 
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

 
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
        HashSet<Integer> set = new HashSet<>();
        for(int i =1;i<=1000000;i++){
         if(isPrime(i))
             set.add(i);
        }

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			 int D = sc.nextInt();
            String strD = String.valueOf(D);
             int A = sc.nextInt();
             int B = sc.nextInt();
            
            int answer = 0;
            
            for(int i=A;i<=B;i++){
             if( set.contains(i)){
                 String str = String.valueOf(i);
                 if(str.contains( strD )){
                  answer++;   
                 }
             }
            }
            
            System.out.println("#"+test_case+" "+answer);

		}
	}
    
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        
         for(int i=2;i*i<=n;i++){
          if(n%i==0)
              return false;
         }
        
        return true;
    }
}