import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer=0;
        
        Arrays.sort(citations);
        int n = citations.length;
        
        for(int i = n-1;i>=0;i--){
          if(citations[i]>=n-i){
              answer = n-i;
          }
        }
 
        
        
        
        return answer;
    }
}