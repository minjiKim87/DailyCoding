import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int cnt=people.length;
        
        int frontIDX=0;
        int backIDX = people.length-1;
        
        while(cnt!=0){
            
            if(frontIDX==backIDX){
                cnt--;
                answer++;
                break;
            }
            if(people[frontIDX]+people[backIDX]<=limit){
                cnt-=2;
                answer++;
                frontIDX++;
                backIDX--;
            }else{
                //가장 무거운 사람 혼자 보냄
                cnt--;
                answer++;
                backIDX--;
            }
            
          
        }
        
        
        
        return answer;
    }
}