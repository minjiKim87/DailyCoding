import java.util.*;

public class Main {
    static class State {
        int rx, ry, bx, by, depth;
        State(int rx, int ry, int bx, int by, int depth) {
            this.rx = rx; this.ry = ry;
            this.bx = bx; this.by = by;
            this.depth = depth;
        }
    }

    static int N, M;
    static char[][] board;
    static boolean[][][][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt();
        board = new char[N][M];

        int rx = 0, ry = 0, bx = 0, by = 0;

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'R') {
                    rx = i; ry = j;
                    board[i][j] = '.';
                } else if (board[i][j] == 'B') {
                    bx = i; by = j;
                    board[i][j] = '.';
                }
            }
        }

        visited = new boolean[N][M][N][M];
        System.out.println(bfs(rx, ry, bx, by));
    }

    static int bfs(int rx, int ry, int bx, int by) {
        Queue<State> q = new LinkedList<>();
        q.add(new State(rx, ry, bx, by, 0));
        visited[rx][ry][bx][by] = true;

        while (!q.isEmpty()) {
            State s = q.poll();
            if (s.depth >= 10) return -1;

            for (int d = 0; d < 4; d++) {
                int[] nRed = move(s.rx, s.ry, dx[d], dy[d]);
                int[] nBlue = move(s.bx, s.by, dx[d], dy[d]);

                int nrx = nRed[0], nry = nRed[1];
                int nbx = nBlue[0], nby = nBlue[1];
                boolean redInHole = nRed[2] == 1;
                boolean blueInHole = nBlue[2] == 1;

                if (blueInHole) continue;
                if (redInHole) return s.depth + 1;

                // 같은 위치에 멈췄을 때 처리
                if (nrx == nbx && nry == nby) {
                    if (nRed[3] > nBlue[3]) {
                        nrx -= dx[d]; nry -= dy[d];
                    } else {
                        nbx -= dx[d]; nby -= dy[d];
                    }
                }

                if (!visited[nrx][nry][nbx][nby]) {
                    visited[nrx][nry][nbx][nby] = true;
                    q.add(new State(nrx, nry, nbx, nby, s.depth + 1));
                }
            }
        }
        return -1;
    }

    // return: [nx, ny, isHole(1이면 구멍), moveCount]
    static int[] move(int x, int y, int dx, int dy) {
        int count = 0;
        while (true) {
            if (board[x + dx][y + dy] == '#') break;
            x += dx;
            y += dy;
            count++;
            if (board[x][y] == 'O') return new int[]{x, y, 1, count};
        }
        return new int[]{x, y, 0, count};
    }
}
