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
			int N = sc.nextInt();
            
             if(N<10){
                System.out.println("#"+test_case+" impossible");
                continue;
            }
               
            int tempN = N;
            int n=0;
   
            int[] numArr = new int[10];
            
            while(tempN>0){
             numArr[tempN%10] ++;
             tempN=tempN/10;
                n++;
            }

            //System.out.println(n);
            int max = (int) Math.pow(10, n); //max이상이면 안됨
         //     test("max", max);
            int kN = N;
            int cnt = 2;
            
            boolean answer = false;
         //   printArr(numArr);
            
          
             while(true){
                 
                // test("N", N);
               // test("cnt", cnt);
                kN = N*cnt;
             //   test("kN", kN);
                 
                 if(kN>=max){
                  break;   
                 }
                 
                int[] clone = numArr.clone();  
        //         printArr(clone);
                 int cnt2 = 0;
                 
                 while(kN>0){
                     if(clone[kN%10]<=0){
                      break;   
                     }                   
                     clone[kN%10]--;
                     
                     kN = kN/10;
                     cnt2++;                   
                 }
                 
               //   printArr(clone);
                 
                 if(cnt2==n){
                  	   answer = true;
                     break;
                     
                 }
                
                cnt++;
            }
            
            System.out.println("#"+test_case+" "+(answer? "possible" : "impossible"));
      
            
			 
		}
	}
    
    public static void printArr(int[] arr){
        System.out.println("----");
     System.out.println(Arrays.toString(arr));   
    }
    public static void test(String label, Object value){
     System.out.println(label+": " + value);   
    }
}