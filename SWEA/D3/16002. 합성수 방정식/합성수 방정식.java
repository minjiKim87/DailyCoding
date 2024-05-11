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
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            
            int N = sc.nextInt();
            System.out.println(N);
            int x = N;
            int y =0;
            int cnt=2;
            
            while(cnt<10){
                y = cnt;
                x = N+y;
                if(x>1000000000 || y>1000000000){
                    break;
                }
                if(isPrime(y)==0 && isPrime(x) ==0){
                     // System.out.println("#"+test_case+" "+x+" "+y);
                    break;
                }
                
                cnt++;
              
            }
            
            System.out.println("#"+test_case+" "+x+" "+y);
            
		}
        
	}
    
    public static int isPrime(int n){
        for(int i =2;i<=(int)Math.sqrt(n);i++){
                if(n%i==0){
                 return 0;   
                }
        	}
        return 1;
       }
    
}