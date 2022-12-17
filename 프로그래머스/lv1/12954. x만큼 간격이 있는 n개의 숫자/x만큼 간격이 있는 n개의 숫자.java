import java.util.*;
import java.io.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i =1;i<1+n;i++){
            answer[i-1] = (long)x+(i-1)*(long)x;
        }
        return answer;
    }
}