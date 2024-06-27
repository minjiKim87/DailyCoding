import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    static int N;
    static char[][] map;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // N 입력 받기
        N = Integer.parseInt(br.readLine());
        
        // N x N 크기의 영상 데이터 입력 받기
        map = new char[N][];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }
        
        // 결과 출력
        System.out.println(compress(0, 0, N));
        
        br.close();
    }
    
    // 쿼드 트리 압축을 위한 재귀 함수
    private static String compress(int x, int y, int size) {
        // 현재 영역이 모두 같은 숫자인지 확인
        if (isSame(x, y, size)) {
            return String.valueOf(map[x][y]);
        }
        
        // 그렇지 않다면, 4개의 영역으로 나눔
        int newSize = size / 2;
        
        StringBuilder result = new StringBuilder();
        result.append("(");
        result.append(compress(x, y, newSize));
        result.append(compress(x, y + newSize, newSize));
        result.append(compress(x + newSize, y, newSize));
        result.append(compress(x + newSize, y + newSize, newSize));
        result.append(")");
        
        return result.toString();
    }
    
    // 주어진 영역이 모두 같은 숫자인지 확인하는 함수
    private static boolean isSame(int x, int y, int size) {
        char value = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (map[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}
