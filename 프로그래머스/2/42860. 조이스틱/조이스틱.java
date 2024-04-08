import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int right, left, move = len-1;
        
        for(int i =0;i<len;i++){
            char c = name.charAt(i);
            answer+=Math.min(c-'A', 'Z'-c+1);
            
            int next = i+1;
            while(next<len && name.charAt(next)=='A')
                next++;
            move = Math.min(move, i+len-next+Math.min(i, len-next));
        }
        
        answer+=move;
        
        return answer;
    }
}