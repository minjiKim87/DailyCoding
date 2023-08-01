import java.util.*;

class Solution {
     List<String> list = new ArrayList<>();
     
    public int solution(String word) {
        int answer = 0;
       
        dfs("");
        answer = list.indexOf(word);
        
        return answer;
    }
    
    public void dfs(String str){
        if(str.length()>5)
            return;
        list.add(str);
        
        dfs(str+"A");
        dfs(str+"E");
        dfs(str+"I");
        dfs(str+"O");
        dfs(str+"U");
        
        
        
    }
}