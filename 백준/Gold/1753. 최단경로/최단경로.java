import java.io.*;
import java.util.*;

public class  Main {
    static class Edge implements Comparable<Edge> {
        int dest, cost;

        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // BufferedReader br = new BufferedReader(new FileReader("example.txt"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int startNode = Integer.parseInt(st.nextToken()) - 1;

        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int dest = Integer.parseInt(st.nextToken()) - 1;
            int cost = Integer.parseInt(st.nextToken());
            graph[start].add(new Edge(dest, cost));
        }

        // 다익스트라 알고리즘
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[V];
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startNode] = 0;
        pq.add(new Edge(startNode, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int currentNode = current.dest;

            if (visited[currentNode]) continue;
            visited[currentNode] = true;

            for (Edge next : graph[currentNode]) {
                if (dist[next.dest] > dist[currentNode] + next.cost) {
                    dist[next.dest] = dist[currentNode] + next.cost;
                    pq.add(new Edge(next.dest, dist[next.dest]));
                }
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) sb.append("INF\n");
            else sb.append(dist[i]).append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    }
}
