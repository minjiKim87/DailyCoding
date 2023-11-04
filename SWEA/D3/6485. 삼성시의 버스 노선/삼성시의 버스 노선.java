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
            int[] A = new int[N];
            int[] B = new int[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }
            int P = sc.nextInt();
            
            int[] C = new int[5001]; // 최대 번호 5000으로 배열 크기 설정
            int[] busStops = new int[P]; // 입력받을 정류장 번호를 저장할 배열
            
            for(int i = 0; i < P; i++){
                busStops[i] = sc.nextInt(); // 정류장 번호 입력받기
            }
            
            for(int i = 0; i < N; i++){
                for(int j = A[i]; j <= B[i]; j++){
                    C[j]++; // 해당하는 정류장 번호의 노선 수를 1 증가
                }
            }

            System.out.print("#" + test_case);
            for(int i = 0; i < P; i++){
                System.out.print(" " + C[busStops[i]]); // 각 정류장 번호에 대응하는 노선 수 출력
            }
            
            System.out.println(); // 줄바꿈으로 테스트 케이스 구분
        }
        sc.close();
    }
}
