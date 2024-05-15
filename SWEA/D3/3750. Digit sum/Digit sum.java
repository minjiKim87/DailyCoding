 
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
			long n = sc.nextLong();
            
           long answer = func(n);
            System.out.println("#"+test_case+" "+answer);		 

		}
	}
    
    public static long func(long n){
       // System.out.println(n);
        
        if(n<10)
            return n;
        long sum=0;
        while(true){
            sum += n%10;
            n = n/10;
            if(n<=0)
                break;           
        }
        
        return func(sum);
    }
}