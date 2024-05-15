import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;

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
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            String str2 = sc.nextLine();
          //  System.out.println(str);  System.out.println(str2);
            String[] arr = str.split(" ");
            String[] arr2 = str2.split(" ");
            HashSet<String> set = new HashSet<>();
            
            for(int i =0;i<arr.length;i++){
                set.add(arr[i]);
            }
            for(int i=0;i<arr2.length;i++){
             set.add(arr2[i]);   
            }
       
            
            int answer = arr.length+arr2.length-set.size();
            System.out.println("#"+test_case+" "+answer);

		}
	}
}