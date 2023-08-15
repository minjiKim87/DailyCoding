import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        //상 -10 하10  우01좌0-1
      
         Set<String> set = new HashSet<>();
        int x = 0, y = 0; // 현재 위치

         for(char dir : dirs.toCharArray()) {
             int nx = x;
             int ny = y;
             
             switch(dir){
                 case 'U' : if(y<5) ny++; break;
                 case 'D' : if(y>-5) ny--; break;
                 case 'R' : if(x<5) nx++;break;
                 case 'L' : if(x>-5) nx--; break;
         
             }
             
             if(x!=nx || y!=ny){
                  set.add(x + "," + y + "," + nx + "," + ny);
                set.add(nx + "," + ny + "," + x + "," + y);

                x = nx;
                y = ny;
             }
             
         }
            
      
        answer = set.size() / 2;
        
        
     
        return answer;
    }
}