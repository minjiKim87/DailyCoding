import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;

 
class Solution
{
    private static final long MOD = 1000000007;
	public static void main(String args[]) throws Exception
	{ 
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
 
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.nextLine();
            char[] arr = str.toCharArray();
      	
            long sum=1;
            int num=1;
            if(arr[0]==arr[1]){
                sum*=1;
            }else{
                sum*=2;
            }
            
             if(arr[arr.length-1]==arr[arr.length-2]){
                sum*=1;
            }else{
                sum*=2;
            }
            
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]!= arr[i-1] && arr[i]!=arr[i+1]&&arr[i-1]!=arr[i+1]){ //3개가 모두 다름
                 num= 3;   
                }else if(arr[i]== arr[i-1] && arr[i]==arr[i+1]){ // 전부 같으면 1가지 경우
                 num = 1;   
                }else if((arr[i]==arr[i-1] && arr[i]!=arr[i+1]) || (arr[i]==arr[i+1] && arr[i]!=arr[i-1]) ||(arr[i-1]==arr[i+1] && arr[i]!=arr[i-1])){
                 num= 2;   
                }
                
                sum = sum*num % MOD;
                //System.out.println(sum);
            }

            System.out.println("#"+test_case+" "+sum);
            
        
            
		 

		}
	}
}