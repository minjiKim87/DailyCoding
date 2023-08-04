/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
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

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int buildingNum = sc.nextInt();
            
     
           //System.out.println("bN " + buildingNum);
         int[] buildingHeight = new int[buildingNum+1];
            int sunny =0;
            
            for(int i = 0; i<buildingNum ;i++){
                 buildingHeight[i] = sc.nextInt();
                //System.out.println(buildingHeight[i]);
            }
         //  int[] buildingHeight={0,0,3,5,2,4,9,0,6,4,0,6,0,0};
      
         int[] aroundArr = new int[4];
            
        for(int i =2 ; i<=buildingNum-3; i++){
            int center = buildingHeight[i];
            aroundArr[0] =buildingHeight[i-1];
            aroundArr[1]  =buildingHeight[i-2];
            aroundArr[2]  = buildingHeight[i+1];
           	aroundArr[3]  = buildingHeight[i+2];
            
  
           /*  System.out.print("center "+center+" : ");
              for(int k =0;k<4;k++){
                  System.out.print(aroundArr[k]+" ");
              }
            System.out.println();
            */
            Arrays.sort(aroundArr);
            
            boolean isSunny=true;
            if(center>aroundArr[3]){
                 for(int j = center ; j>aroundArr[3];j--){
                     isSunny=true;
                        for(int k =0;k<4 ; k++){
                           // System.out.println("j "+j+", "+aroundArr[k]);
                            if(j<=aroundArr[k]){
                                 isSunny = false;
                                break;
                            }

                        }
                     if(isSunny)
                         sunny++;
                    }
            }
                //System.out.println(sunny);
            }

       
        
        
        System.out.println("#"+test_case+" "+sunny);
       
        } //tc괄호

        
	}
}