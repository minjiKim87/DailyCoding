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
			String bi  = sc.nextLine();
			 String tri = sc.nextLine();
            
            ArrayList<Integer> biList = new ArrayList<>();
            
            for(int i =0;i<bi.length();i++){
             String str1 = bi.substring(0, i);
             String change = Character.toString(bi.charAt(i));
                if(change.equals("0")){
                 change = "1";   
                }else{
                 change="0";   
                }
              String str2 = bi.substring(i+1);
              String newbi  = str1+change+str2;
     
                biList.add(Integer.parseInt(newbi, 2));
            }
            
      //      System.out.println(biList.toString());
           	Collections.sort(biList);
            
            
                 ArrayList<Integer> triList = new ArrayList<>();
            
            for(int i =0;i<tri.length();i++){
            //    System.out.println(i);
                
             String str1 = tri.substring(0, i);
             String change = Character.toString(tri.charAt(i));
             String str2 = tri.substring(i+1);
                
             //   System.out.println(str1+", "+change+", "+str2);
                
                if(change.equals("0")){
                 change = "1";                    
              	String newtri  = str1+change+str2;     
                triList.add(Integer.parseInt(newtri, 3));
                    
                       change = "2";                    
            	newtri  = str1+change+str2;     
                triList.add(Integer.parseInt(newtri, 3));
                    
                }else if(change.equals("1")){
                           change = "0";                    
              	String newtri  = str1+change+str2;     
                triList.add(Integer.parseInt(newtri, 3));
                    
                       change = "2";                    
                   newtri  = str1+change+str2;     
                triList.add(Integer.parseInt(newtri, 3));
                      
                }else{
                change = "0";                    
              	String newtri  = str1+change+str2;     
                triList.add(Integer.parseInt(newtri, 3));
                    
                       change = "1";                    
              	 newtri  = str1+change+str2;     
                triList.add(Integer.parseInt(newtri, 3));
                }
     
            }
            
            Collections.sort(triList);
     //        System.out.println(triList.toString());
            
            int n=0;
            
            for(int i =0;i<biList.size();i++){
             n = biList.get(i);
                
                if(triList.contains(n)){
                 
                    break;
                }
            }
            
            System.out.println("#"+test_case+ " "+n);
            
            
            

		}
         
           
	}
}