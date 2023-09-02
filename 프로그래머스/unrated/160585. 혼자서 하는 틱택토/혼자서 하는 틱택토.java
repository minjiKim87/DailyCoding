class Solution {
    public int solution(String[] board) {
        int answer = 1;
        char[][] arr = new char[3][3];
        int[] cnt = new int[3];

        
         boolean beforeStart = true;
        
        for (int i = 0; i < 3; i++) {
             if(!board[i].equals("...")){
                beforeStart = false;
            }
            
            for (int j = 0; j < 3; j++) {
                arr[i][j] = board[i].charAt(j);

                if (arr[i][j] == 'O') {
                    cnt[0] += 1;
                } else if (arr[i][j] == 'X') {
                    cnt[1] += 1;
                } else {
                    cnt[2] += 1;
                }
            }
        }

         if(beforeStart)
            return 1;
        
        if (cnt[0] < cnt[1] || Math.abs(cnt[0] - cnt[1]) > 1) {
            return 0;
        }

        boolean oWin = false;
        boolean xWin = false;

        
        for (int i = 0; i < 3; i++) {
                      
            //행
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                if (arr[i][0] == 'O') {
                    oWin = true;
                } else if (arr[i][0] == 'X') {
                    xWin = true;
                }
            }

            //열
            if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
                if (arr[0][i] == 'O') {
                    oWin = true;
                } else if (arr[0][i] == 'X') {
                    xWin = true;
                }
            }
        }

        //대각선
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
            if (arr[0][0] == 'O') {
                oWin = true;
            } else if (arr[0][0] == 'X') {
                xWin = true;
            }
        }

        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
            if (arr[0][2] == 'O') {
                oWin = true;
            } else if (arr[0][2] == 'X') {
                xWin = true;
            }
        }

        if (oWin && xWin) {
            return 0;
        }

        if (oWin && cnt[0] <= cnt[1]) {
            return 0;
        }

        if (xWin && cnt[0] > cnt[1]) {
            return 0;
        }

        if (!oWin && !xWin && cnt[2] == 0 && cnt[0] != cnt[1] + 1) {
            return 0;
        }

        return answer;
    }
}
