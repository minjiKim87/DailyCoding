import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : reserve) {
           map.put(i, 1); // 여분 체육복을 가진 학생을 1로 표시
        }
        
        for (int i : lost) {
            if(map.containsKey(i)) { // 여분 체육복을 가진 학생이 도난당했으면
                map.put(i, 0); // 그 학생은 체육복을 빌려줄 수 없으므로 0으로 표시
            } else {
                map.put(i, -1); // 도난당한 학생을 -1로 표시
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if(map.get(i) == null || map.get(i) >= 0) { // 체육복을 가진 학생이면
                answer++; // 수업을 들을 수 있다
            } else if(map.get(i) == -1) { // 체육복이 없는 학생이면
                if(map.get(i - 1) != null && map.get(i - 1) == 1) { // 왼쪽 학생이 체육복을 빌려줄 수 있으면
                    map.put(i - 1, 0); // 왼쪽 학생이 체육복을 빌려준다
                    answer++; // 수업을 들을 수 있다
                } else if(map.get(i + 1) != null && map.get(i + 1) == 1) { // 오른쪽 학생이 체육복을 빌려줄 수 있으면
                    map.put(i + 1, 0); // 오른쪽 학생이 체육복을 빌려준다
                    answer++; // 수업을 들을 수 있다
                }
            }
        }
        
        return answer;
    }
}
