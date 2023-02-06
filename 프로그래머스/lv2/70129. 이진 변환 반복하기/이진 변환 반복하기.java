import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        String[] strSplit = s.split("");
        ArrayList<String> list = new ArrayList<String>();
        for(String j : strSplit){
            list.add(j);
        }

        String binary="";
     
        String zero="0";
         while(true){ 
            answer[0]++;
            Collections.sort(list);
            answer[1]+=Collections.frequency(list,"0");
            while( list.remove("0")){
                
            };
          //  System.out.println(list.toString());
            binary = Integer.toBinaryString(list.size());
         
             strSplit = binary.split("");    
            
            list.clear();
           
            for(String j : strSplit){
             list.add(j);
               }
          
            if(list.size()<=1)
                break;
            
        }
     
        return answer;
    }
}