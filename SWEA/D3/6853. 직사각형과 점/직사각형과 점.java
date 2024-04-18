import java.util.*;
 
class Solution
{
	public static void main(String args[]) throws Exception
	{
 
 
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	 
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            
            int N = sc.nextInt();
            int[] answer = new int[3];
            
            for(int i =0;i<N;i++){
                int x= sc.nextInt();
                int y = sc.nextInt();
                int index = func(X1, Y1, X2, Y2, x, y);
                answer[index]++;
            }
            
            System.out.println("#"+test_case+" " + answer[0]+ " " +answer[1]+" " +answer[2]);
            

		 
		}
	}
    
    public static int func(int X1, int Y1, int X2, int Y2, int x, int y){
        //return 0 내부 1 변 위 2 외부 
       /* if(X1<x && x<X2 && Y1 < y && y<Y2){
            return 0;
        }*/
        if(x<X1 || X2<x||y<Y1||Y2<y){
            return 2;
        }
        if(X1==x || X2==x || Y1==y || Y2==y){
            return 1;
        }
        
 
            
        return 0; 
    }
}