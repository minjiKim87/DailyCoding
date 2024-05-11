
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
            
            int[] skill = new int[K];
            
            for(int i =0;i<N*K;i++){
                int group = 0;
                
                if( (i/K)%2==0){
                	group = i%K;
                }else{
                  	group = K-1-(i%K);   
                }
                
                skill[group]+=i+1;
            }
            
             System.out.print("#" + test_case);
            for (int s : skill) {
                System.out.print(" " + s);
            }
            System.out.println();

		}
	}
}