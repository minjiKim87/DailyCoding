import java.io.*;
import java.util.*;

class Tomato {
    int h;
    int n;
    int m;

    Tomato(int h, int n, int m) {
        this.h = h;
        this.n = n;
        this.m = m;
    }
}

public class Main {
    static int[][][] tomatoes;
    static Queue<Tomato> q = new LinkedList<>();
    static int[][] directions = {{0, 0, 1}, {0, 0, -1}, {0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}};
    static int M, N, H;

    public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         //BufferedReader br = new BufferedReader(new FileReader("example.txt"));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        tomatoes = new int[H][N][M];

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    tomatoes[h][n][m] = Integer.parseInt(st.nextToken());
                    if (tomatoes[h][n][m] == 1) {
                        q.add(new Tomato(h, n, m));
                    }
                }
            }
        }

        br.close();

        int result = bfs(tomatoes);
        System.out.println(result);
    }

    public static int bfs(int[][][] arr) {
        while (!q.isEmpty()) {
            Tomato t = q.poll();

            for (int k = 0; k < 6; k++) {
                int movedH = t.h + directions[k][0];
                int movedN = t.n + directions[k][1];
                int movedM = t.m + directions[k][2];

                if (movedH >= 0 && movedH < H && movedN >= 0 && movedN < N && movedM >= 0 && movedM < M) {
                    if (arr[movedH][movedN][movedM] == 0) {
                        q.add(new Tomato(movedH, movedN, movedM));
                        arr[movedH][movedN][movedM] = arr[t.h][t.n][t.m] + 1;
                    }
                }
            }
        }

        int result = 0;

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (arr[h][n][m] == 0)
                        return -1;

                    result = Math.max(result, arr[h][n][m]);
                }
            }
        }

        if (result == 1) { 
            return 0;  
        } else {
            return result - 1; 
        }
    }
}