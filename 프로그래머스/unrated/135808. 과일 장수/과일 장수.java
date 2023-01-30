import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int sc:score){
            list.add(sc);
        }
        Collections.sort(list);
      //  System.out.println(list);
        /*
        m은 정해져있음, 남는 사과는 버리고 가능한 많은 사과
        
        */
        
        int boxNumber= (int)(list.size()/m);
      //  System.out.println(boxNumber);
        for(int i =1; i<=boxNumber;i++){
          answer+=list.get(list.size()-i*m)*m;
          //  System.out.println(list.size()-i*m);
        }
        
        
        return answer;
    }
}