 
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

 
class Solution
{
	public static void main(String args[]) throws Exception
	{
		 
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        ArrayList<Integer> origin = new ArrayList<>();
        for(int i = 2;i<=9;i++){
         origin.add(i);   
            origin.add(i);   
            origin.add(i);   
            origin.add(i);   
        }
              for(int i=0;i<16;i++){
         origin.add(10);   
        }
        
        origin.add(11); origin.add(11); origin.add(11); origin.add(11);
        
  
        //  System.out.println(origin.toString());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); 
      
            ArrayList<Integer> caseList = new ArrayList<>(origin);
           // System.out.println(caseList.toString());
            
            int curr=0;
            int sum=0;
            for(int i =0;i<N;i++){
              curr = sc.nextInt();
                sum+=curr;
               caseList.remove(curr);
            }
            
            
			 
            int cnt = 21-sum;
            int index = 0;
            while(cnt>0){
                
                 index = caseList.lastIndexOf(cnt);
                if(index ==-1){
                    cnt--;
                }else{
                 break;   
                }
            }
            
           // System.out.println("sum "+sum+" cnt "+cnt+" index "+index);
          //  System.out.println(caseList.toString());
            System.out.print("#"+test_case+" ");
            
            if(index<caseList.size()/2){
             System.out.println("STOP");   
            }else{
             System.out.println("GAZUA");   
            }
  			
            

		}
	}
    
}