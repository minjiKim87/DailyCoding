import java.util.*;

class Solution {
    public int[] solution(int n) {
        // n * (n + 1) / 2 는 n 까지의 합을 구하는 공식입니다.
        int totalNumbers = n * (n + 1) / 2;
        int[][] triangle = new int[n][n];
        
        int x = 0, y = 0;
        int number = 1;

        // 방향을 변경하기 위한 배열입니다. (아래, 오른쪽, 위쪽 순)
        int[] dx = {1, 0, -1};
        int[] dy = {0, 1, -1};
        
        int dir = 0; // 시작 방향은 아래쪽입니다.

        while (number <= totalNumbers) {
            if (x < 0 || x >= n || y < 0 || y >= n || triangle[x][y] != 0) {
                // 방향을 변경합니다.
                x -= dx[dir];
                y -= dy[dir];
                dir = (dir + 1) % 3;
            } else {
                triangle[x][y] = number++;
            }

            x += dx[dir];
            y += dy[dir];
        }
        
        int[] answer = new int[totalNumbers];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = triangle[i][j];
            }
        }
        
        return answer;
    }

  
}
