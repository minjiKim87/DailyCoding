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
			long N = sc.nextInt();
            long left = 2*(N-1)*(N-1)+1;
            long right = 2*N*N-1;
            
            System.out.println("#"+test_case+" "+left+" " +right);
			

		}
	}
}