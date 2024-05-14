import java.util.*;
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
            double[] arr = new double[3];
            arr[0]= sc.nextDouble();
              arr[1]= sc.nextDouble();
              arr[2]= sc.nextDouble();
            
      
            double sum = arr[0]+arr[1]+arr[2];
            
              //     System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
            
            double x1 = (sum-3*arr[1]) / 2;
            double x2 = 3*arr[1] - sum;
            
          //s  System.out.println(x1+", "+x2);
            
            double x = Math.min(Math.abs(x1), Math.abs(x2));
            
          
                 System.out.print("#"+test_case+" ");
                System.out.printf("%.1f\n", x);
            
        
		
	 
		}
	}
}