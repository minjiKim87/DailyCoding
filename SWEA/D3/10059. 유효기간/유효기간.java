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
        sc.nextLine();
	 
		for(int test_case = 1; test_case <= T; test_case++)
		{
		 	String str = sc.nextLine();
   			int front = Integer.parseInt(str.substring(0,2));
            int back = Integer.parseInt(str.substring(2));
  
            StringBuilder sb = new StringBuilder();
            
            sb.append("#"+test_case+" ");
            
            if(front>=13 && back>=13){
                sb.append("NA");
            }else if(front<=12 && back<=12 &&(front>0 && back>0)){
                sb.append("AMBIGUOUS");    
            }else if(front<=12 && front>0 && (back>=13||back==0)){
                sb.append("MMYY");                
            }else if((front>=13||front==0) && back<=12 && back>0){
                sb.append("YYMM");                 
            }else if(front==0&&back==0){
             sb.append("NA");   
            }else{
             sb.append("NA");   
            }
 			
            System.out.println(sb.toString());
               
		}
	}
}