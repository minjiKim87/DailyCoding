import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] board = new int[N][N];

            // 보드 초기화
            int mid = N / 2;
            board[mid-1][mid-1] = 2;
            board[mid-1][mid] = 1;
            board[mid][mid-1] = 1;
            board[mid][mid] = 2;

            for (int i = 0; i < M; i++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                int color = sc.nextInt();
                placeStone(board, x, y, color, N);
            }

            // 결과 계산
            int black = 0, white = 0;
            for (int[] row : board) {
                for (int stone : row) {
                    if (stone == 1) black++;
                    if (stone == 2) white++;
                }
            }

            System.out.println("#" + test_case + " " + black + " " + white);
        }
        sc.close();
    }

    private static void placeStone(int[][] board, int x, int y, int color, int N) {
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
        board[x][y] = color;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            boolean valid = false;

            while (nx >= 0 && ny >= 0 && nx < N && ny < N && board[nx][ny] != 0 && board[nx][ny] != color) {
                nx += dx[i];
                ny += dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N && board[nx][ny] == color) {
                    valid = true;
                    break;
                }
            }

            if (valid) {
                nx = x + dx[i];
                ny = y + dy[i];
                while (board[nx][ny] != color) {
                    board[nx][ny] = color;
                    nx += dx[i];
                    ny += dy[i];
                }
            }
        }
    }
}
