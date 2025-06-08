import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int to, cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static int N, M, X;
    static List<Edge>[] graph, reverseGraph;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken()) - 1; // 0-indexed

        graph = new ArrayList[N];
        reverseGraph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            int t = Integer.parseInt(st.nextToken());
            graph[u].add(new Edge(v, t));
            reverseGraph[v].add(new Edge(u, t)); // 역방향 그래프
        }

        int[] distTo = dijkstra(graph, X);       // X → i
        int[] distFrom = dijkstra(reverseGraph, X); // i → X via 역그래프

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, distTo[i] + distFrom[i]);
        }

        System.out.println(max);
    }

    static int[] dijkstra(List<Edge>[] g, int start) {
        int[] dist = new int[N];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.cost));
        pq.offer(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            if (dist[cur.to] < cur.cost) continue;

            for (Edge next : g[cur.to]) {
                if (dist[next.to] > dist[cur.to] + next.cost) {
                    dist[next.to] = dist[cur.to] + next.cost;
                    pq.offer(new Edge(next.to, dist[next.to]));
                }
            }
        }

        return dist;
    }
}
