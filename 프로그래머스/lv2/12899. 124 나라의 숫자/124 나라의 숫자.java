import java.util.*;

class Solution {
    List<String> combinations = new ArrayList<>();

    public String solution(int n) {
            StringBuilder answer = new StringBuilder();
            while (n > 0) {
                int remainder = n % 3;
                n /= 3;

                if (remainder == 0) {
                    remainder = 4;
                    n -= 1;  // 4를 사용할 때는 나누는 수를 1 빼줍니다.
                }

                answer.insert(0, remainder);
            }
            return answer.toString();
    }

 
}
