 
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
       
            String[] arr = sc.nextLine().split(" ");
           // System.out.println(arr[0]+", "+arr[1]);
            int n = arr[0].length();
            int m = arr[1].length();
            
            int k = lcm(n, m );
        //    System.out.println(k);
            String str1 = "";
            String str2 = "";
            for(int i =0;i<k/n;i++){
                str1 += arr[0];
            }
            for(int i=0;i<k/m;i++){
             str2 += arr[1];   
            }
            
       		System.out.print("#"+test_case+" ");
            if(str1.equals(str2))
                System.out.println("yes");
            else
                System.out.println("no");

		}
	}
    
    public static int lcm(int a, int b){
     return a*(b/gcd(a, b));   
    }
    
    public static int gcd(int a, int b){
     while(b!=0){
          int temp = b;
          b = a%b;
          a = temp;
         }
        return a;
    }
}