import java.util.*;


class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> origin = new Stack<>();
        for(int i =s.length()-1;i>=0;i--){
            origin.add(s.charAt(i));
        }
        
        if(origin.peek()==')')
            answer = false;
        else{
            
            Stack<Character> open = new Stack<>();
            
            open.push(origin.pop());
            
            while(!origin.isEmpty()){
                 
                Character c = origin.pop();
                
                if(open.isEmpty() && c==')'){
                    answer = false;
                    break;
                }else if(!open.isEmpty() && c==')'){
                    open.pop();
                }else if(c =='('){
                    open.add(c);
                }
            }
            
            if(open.size()>0)
                answer = false;
            
            
            
        }
        

        return answer;
    }
}