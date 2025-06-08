import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 총 날짜 수
        int m = Integer.parseInt(st.nextToken()); // 최대 일할 수 있는 날 수

        int[] T = new int[n]; // 일급 배열은 int로 충분 (개별 Ti는 1,000,000 이하)
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            T[i] = Integer.parseInt(st.nextToken());
        }

        if (m == 0) {
            System.out.println(0);
            return;
        }

        long sum = 0;
        for (int i = 0; i < m; i++) {
            sum += T[i];
        }

        long max = sum;

        for (int i = m; i < n; i++) {
            sum += T[i] - T[i - m]; // 슬라이딩 윈도우 이동
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
