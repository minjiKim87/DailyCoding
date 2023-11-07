import java.util.*;
import java.io.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // nextInt 후에 남은 개행 문자 제거

        for(int test_case = 1; test_case <= T; test_case++) {
            int[][] board = new int[8][8];
            int cnt = 0;

            for (int i = 0; i < 8; i++) {
                String line = sc.nextLine();
                
                for (int j = 0; j < 8; j++) {
                    if (line.charAt(j) == 'O') {
                        cnt++;
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 0;
                    }
                }
            }

            if(cnt != 8) {
                System.out.println("#" + test_case + " no");   
            } else {
                int[] rowSums = new int[8];
                int[] colSums = new int[8];
                
                // 행과 열의 합을 계산
                for (int r = 0; r < 8; r++) {
                    for (int c = 0; c < 8; c++) {
                        rowSums[r] += board[r][c];
                        colSums[c] += board[r][c];
                    }
                }
                
                // 결과를 체크하여 출력
                boolean valid = true;
                for (int sum : rowSums) {
                    if (sum > 1) {
                        valid = false;
                        break;
                    }
                }
                
                for (int sum : colSums) {
                    if (sum > 1) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    System.out.println("#" + test_case + " yes");
                } else {
                    System.out.println("#" + test_case + " no");
                }
            }
        }

        sc.close();
    }
}
