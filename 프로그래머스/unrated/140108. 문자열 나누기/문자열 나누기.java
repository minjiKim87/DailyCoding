import java.util.*;

class Solution {
    public int solution(String s) {
        //첫글자 포함 개수
        int answer = 0;

        //cnt1=4, cnt2=4 일때 그다음턴은 index=8부터 시작해야됨.
        char rule =s.charAt(0);
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<s.length();i++){
            if(rule==1) 
                rule = s.charAt(i);
       
            if(rule == s.charAt(i))
                cnt1++;
            else
                cnt2++;
            
            if(cnt1==cnt2){
                answer++;
                cnt1=0;
                cnt2=0;
                rule=1;
                
        
                
            }
           
        }
     if(rule!=1)
         answer++;

        return answer;
    }
}