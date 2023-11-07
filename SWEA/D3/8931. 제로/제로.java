
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Stack;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
            Stack<Integer> stack = new Stack<>();
            
            int K = sc.nextInt();
            int number = 0;
            for(int i =0;i<K;i++){
                number = sc.nextInt();
                if(number==0)
                    stack.pop();
                else
                    stack.push(number);
            }
		
            int answer=0;
			while(!stack.isEmpty()){
            	answer += stack.pop();
            }
            System.out.println("#"+test_case+" "+answer);
            

		}
	}
}