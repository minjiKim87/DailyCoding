import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        ArrayList<String> list = new ArrayList<String>();
        boolean flag = true;

       list.add(words[0]);
        
        for(int i =1;i<words.length;i++){
            if(list.contains(words[i])){
                answer[0]=(i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
            
            list.add(words[i]);
            
             if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
        }
    }
     
        return answer;
    }
}