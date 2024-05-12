import java.util.*;
import java.io.*;

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
          
            String strN = sc.nextLine();
            int len = strN.length();
            
          //  System.out.println(strN);
       
            int first = len > 0 ? strN.charAt(0) - '0' : 0;
            int second = len > 1 ? strN.charAt(1) - '0' : 0;
            int third = len > 2 ? strN.charAt(2) - '0' : 0;

          // System.out.println(first+","+second+","+third);
              StringBuilder sb = new StringBuilder();
            if(third>=5){
              second = second+1;
              if(second==10){
                  first+=1;
                  second=0;
                  
                  if(first==10)
                  	sb.append("1.0*10^"+len);
                  else
                     sb.append(first+".0*10^"+(len-1));
                  
              }else{
                       sb.append(first+"."+second+"*10^"+(len-1));
              }
            }else{
                sb.append(first+"."+second+"*10^"+(len-1));
            }
            
            
            System.out.println("#"+test_case+" "+sb.toString());
           

		}
	}
}