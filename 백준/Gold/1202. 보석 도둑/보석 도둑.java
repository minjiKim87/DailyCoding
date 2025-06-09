import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력: N = 보석 수, K = 가방 수
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 보석 정보 저장
        int[][] jew = new int[N][2];
        ArrayList<int[]> jewList = new ArrayList<>();

        // 보석 입력: 무게, 가격
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jew[i][0] = Integer.parseInt(st.nextToken()); // 무게
            jew[i][1] = Integer.parseInt(st.nextToken()); // 가격
            jewList.add(jew[i]);
        }

        // 보석 무게 기준 오름차순 정렬
        jewList.sort((a, b) -> Integer.compare(a[0], b[0]));

        // 가방 입력
        ArrayList<Integer> bag = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            bag.add(Integer.parseInt(br.readLine()));
        }

        // 가방 무게제한 기준 오름차순 정렬
        Collections.sort(bag);

        // 가격 기준 최대 힙 (가장 비싼 보석을 바로 꺼내기 위함)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long totalValue = 0; // 훔친 보석 가격 합
        int idx = 0; // jewList 순회 인덱스

        for (int i = 0; i < K; i++) {
            int capacity = bag.get(i);

            // 현재 가방에 담을 수 있는 보석을 PQ에 넣는다
            while (idx < N && jewList.get(idx)[0] <= capacity) {
                pq.add(jewList.get(idx)[1]); // 가격만 PQ에 저장
                idx++;
            }

            // 가장 비싼 보석 하나만 선택해 총 가치에 더한다
            if (!pq.isEmpty()) {
                totalValue += pq.poll();
            }
        }

        System.out.println(totalValue);
    }
}
