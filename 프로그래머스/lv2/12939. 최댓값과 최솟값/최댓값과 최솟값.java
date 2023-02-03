import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitStr = s.split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i =0;i<splitStr.length;i++){
            if(splitStr[i].charAt(0)=='-'){
                list.add((-1)*Integer.parseInt(splitStr[i].substring(1)));
            }else{
                list.add(Integer.parseInt(splitStr[i]));
                
            }
                
        }
        
        Collections.sort(list);
            
        answer += list.get(0);
        answer+= " "+list.get(list.size()-1);
        
        return answer;
    }
}