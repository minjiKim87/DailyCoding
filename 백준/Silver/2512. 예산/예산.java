import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] request;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        request = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxRequest = 0;
        for (int i = 0; i < N; i++) {
            request[i] = Integer.parseInt(st.nextToken());
            maxRequest = Math.max(maxRequest, request[i]);
        }

        M = Integer.parseInt(br.readLine());

        int left = 0;
        int right = maxRequest;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (isPossible(mid)) {
                ans = mid;           // 가능한 경우 더 큰 상한액 시도
                left = mid + 1;
            } else {
                right = mid - 1;     // 예산 초과 → 상한액 줄이기
            }
        }

        System.out.println(ans);
    }

    static boolean isPossible(int limit) {
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Math.min(request[i], limit);
        }
        return sum <= M;
    }
}
