import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer="";
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String c : completion){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
 
        for(String s :participant){
            if(!map.containsKey(s)){
                answer = s;
                break;
            }else if(map.containsKey(s)&&map.get(s)==0){
                answer = s;
                break;
            }
            
            map.put(s, map.get(s)-1);
        }
       
        return answer;
    }
}