import java.util.Scanner;
import java.io.FileInputStream;

 
class Solution
{
	public static void main(String args[]) throws Exception
	{ 
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
 	sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.nextLine(); 
            int N = str.length();
            boolean answer = true;
       
            int i =0;
            int j = N-1;

            while(i<j){
                char front = str.charAt(i);
                char back = str.charAt(j);
             	
                if(front=='*' || back=='*'){
                 break;   
                }else {
                 if(front!=back){
                       answer = false;
                     break;
                 }
                   
                }
                i++;
                j--;
            }
            System.out.println("#"+test_case+" "+(answer? "Exist":"Not exist"));
			 

		}
	}
}