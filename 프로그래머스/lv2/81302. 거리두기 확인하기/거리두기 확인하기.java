import java.util.*;

class Solution {
    int[][] closeDirections = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    int[][] farDirections = {{2, 0}, {0, 2}, {-2, 0}, {0, -2}};
    int[][] diagonalDirections = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        Arrays.fill(answer, 1);

        for (int t = 0; t < 5; t++) {
            char[][] map = new char[5][5];
            for (int j = 0; j < 5; j++) {
                map[j] = places[t][j].toCharArray();
            }

            outerLoop:
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (map[i][j] == 'P') {
                        if (!isValidPosition(map, i, j)) {
                            answer[t] = 0;
                            break outerLoop;
                        }
                    }
                }
            }
        }
        return answer;
    }

    public boolean isValidPosition(char[][] map, int row, int col) {
        for (int[] dir : closeDirections) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isInBounds(newRow, newCol) && map[newRow][newCol] == 'P') {
                return false;
            }
        }

        for (int[] dir : farDirections) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isInBounds(newRow, newCol) && map[newRow][newCol] == 'P') {
                if (Math.abs(dir[0]) == 2 && map[(newRow + row) / 2][col] != 'X') {
                    return false;
                }
                if (Math.abs(dir[1]) == 2 && map[row][(newCol + col) / 2] != 'X') {
                    return false;
                }
            }
        }

        for (int[] dir : diagonalDirections) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isInBounds(newRow, newCol) && map[newRow][newCol] == 'P') {
                if (map[row][newCol] == 'O' || map[newRow][col] == 'O') {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && row < 5 && col >= 0 && col < 5;
    }
}
