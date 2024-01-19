import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];

        // 모든 숫자에 대해 최대값으로 초기화
        for (int i = 0; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // 0은 제곱수 0개로 표현 가능
        dp[0] = 0;

        // 각 숫자에 대한 최소 제곱수 개수 계산
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        System.out.println(dp[N]);
        br.close();
    }
}
