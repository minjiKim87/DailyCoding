import java.util.*;

class Solution {
    public int solution(int[] money) {
        int answer = 0;
        
        int n = money.length;
        
        int[] dpO = new int[n];
        int[] dpX = new int[n];
        
        dpO[0] = money[0];
        dpO[1]=money[0];
        dpX[0] = 0;
        dpX[1]=money[1];
        
        for(int i=2;i<n;i++){
            dpO[i] = Math.max(dpO[i-1], money[i]+dpO[i-2]);
            dpX[i] = Math.max(dpX[i-1], money[i]+dpX[i-2]);
        }
        
        answer = Math.max(dpO[n-2], dpX[n-1]);
        
        return answer;
    }
}