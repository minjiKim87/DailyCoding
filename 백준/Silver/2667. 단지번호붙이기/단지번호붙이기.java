import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    static int N;
    static char[][] map;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        map = new char[N][N];
        visited = new boolean[N][N];
        
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '1' && !visited[i][j]) {
                    int cnt = dfs(i, j);
                    minHeap.offer(cnt);
                }
            }
        }
        
        System.out.println(minHeap.size());
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }

    static int dfs(int x, int y) {
        visited[x][y] = true;
        int count = 1;
        
        for (int d = 0; d < 4; d++) {
            int nx = x + dr[d];
            int ny = y + dc[d];
            
            if (nx >= 0 && ny >= 0 && nx < N && ny < N && map[nx][ny] == '1' && !visited[nx][ny]) {
                count += dfs(nx, ny);
            }
        }
        
        return count;
    }
    
//    static Queue
//    
//    static int bfs(int x, int y) {
//    	
//    }
}
