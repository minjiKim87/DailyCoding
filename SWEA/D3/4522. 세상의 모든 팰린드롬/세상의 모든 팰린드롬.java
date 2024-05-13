
import java.io.FileInputStream;
import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
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
            //System.out.println(str);
            
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            reverse = reverse.substring(0, str.length()/2);
            str = str.substring(0, str.length()/2);
            
            System.out.print("#"+test_case+" ");
            String answer = "Exist";
            
            for(int i =0;i<str.length();i++){
                if(!(str.charAt(i) =='?' || reverse.charAt(i)=='?')){
                 if(str.charAt(i) != reverse.charAt(i)){
                 answer = "Not exist";
                 break;
             }
                }
            
            }
        
            
            System.out.println(answer);

		}
	}
}