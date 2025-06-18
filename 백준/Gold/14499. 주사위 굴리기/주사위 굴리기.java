import java.util.*;

public class Main {
    static int N, M, x, y, K;
    static int[][] map;
    static int[] dice = new int[7]; // 1~6 index 사용
    static int[] dx = {0, 0, 0, -1, 1}; // dummy, 동 서 북 남
    static int[] dy = {0, 1, -1, 0, 0}; // dummy, 동 서 북 남

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt();
        x = sc.nextInt(); y = sc.nextInt();
        K = sc.nextInt();

        map = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                map[i][j] = sc.nextInt();

        int[] commands = new int[K];
        for (int i = 0; i < K; i++)
            commands[i] = sc.nextInt();

        for (int dir : commands) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M)
                continue;

            roll(dir);
            x = nx;
            y = ny;

            if (map[x][y] == 0) {
                map[x][y] = dice[6];
            } else {
                dice[6] = map[x][y];
                map[x][y] = 0;
            }

            System.out.println(dice[1]); // 윗면 출력
        }
    }

    static void roll(int dir) {
        int[] temp = dice.clone();
        if (dir == 1) { // 동쪽
            dice[1] = temp[4];
            dice[4] = temp[6];
            dice[6] = temp[3];
            dice[3] = temp[1];
        } else if (dir == 2) { // 서쪽
            dice[1] = temp[3];
            dice[3] = temp[6];
            dice[6] = temp[4];
            dice[4] = temp[1];
        } else if (dir == 3) { // 북쪽
            dice[1] = temp[5];
            dice[5] = temp[6];
            dice[6] = temp[2];
            dice[2] = temp[1];
        } else if (dir == 4) { // 남쪽
            dice[1] = temp[2];
            dice[2] = temp[6];
            dice[6] = temp[5];
            dice[5] = temp[1];
        }
    }
}
