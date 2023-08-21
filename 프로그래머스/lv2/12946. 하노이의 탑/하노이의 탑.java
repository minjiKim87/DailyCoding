import java.util.*;
class Solution {
      List<int[]> list = new ArrayList<>(); 
    public int[][] solution(int n) {
        
        func(1, 2, 3, n);
        
        int[][] answer = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            //System.out.println(answer[i][0]+", "+answer[i][1]);
        }
        return answer;
    }
    public void func(int src, int aux, int dest, int n){
        if(n==1){
            move(src, dest);
            return;
        }
        
        func(src, dest, aux, n-1);
        move(src, dest);
        func(aux, src, dest, n-1);
       
    }
    
    public void move(int src, int dest){
        list.add(new int[]{src, dest});
    }
}