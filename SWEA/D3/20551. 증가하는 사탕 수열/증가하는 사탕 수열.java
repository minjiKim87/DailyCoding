import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            if(A>0 && A<B && B<C){
                 System.out.println("#" + test_case + " 0");
                continue;
            }

            int eat=0;
            int a=A;
            int b=B;
            int c=C;
            
            
            
            if(a>=b){
                eat += a-b+1;
                a=b-1;
            }
            if(c<=b){
                eat += b-c+1;
                b = c-1;
            }
            if(a>=b){
                eat+=a-b+1;
                a= b-1;
            }
          
            if(!(a>0&&b>0&&c>0)){
                eat = -1;               
            }
            // 결과 출력
            System.out.println("#" + test_case + " " + eat);
        }
    }
}
