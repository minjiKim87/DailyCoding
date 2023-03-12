import java.util.*;
import java.util.Map.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
       Map<Integer, Integer> sizeMap = new HashMap<Integer, Integer>();
        
        for(int size : tangerine){
            sizeMap.put(size, sizeMap.getOrDefault(size, 0)+1);
        }

       List<Integer> keySet = new ArrayList<>(sizeMap.keySet());
        
       keySet.sort((o1, o2)->sizeMap.get(o2).compareTo(sizeMap.get(o1))); 
 
        int temp=0;    
        for(int s: keySet){
        temp+= sizeMap.get(s);
        answer++;
        if(temp>=k)
            break;
      
}
      
        
        return answer;
    }
}