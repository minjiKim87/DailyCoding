 
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
            int answer=0;
		 	int[] arr = new int[4];
            for(int i =0;i<4;i++){
             arr[i]=sc.nextInt();   
               // System.out.println(arr[i]);
            }
            int A=0;
            int B=0;
            int C=0;
            int D=0;
            if(arr[0]<=arr[2]){
                A = arr[0];
                B=arr[1];
                C=arr[2];
                D=arr[3];
            }else{
                 A=arr[2];
                B=arr[3];
                C=arr[0];
                D=arr[1];
            }
            
            if(D<=B){
                answer = D-C;
            }else if(C<=B && B<=D){
             answer = B-C;   
            }else if(B<=C){
             answer = 0;   
            }
            System.out.println("#"+test_case+" "+answer);

		}
	}
}