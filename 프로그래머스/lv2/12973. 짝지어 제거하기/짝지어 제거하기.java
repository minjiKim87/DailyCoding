import java.util.*;
class Solution
{  
    public int solution(String s){
        int answer = -1;
        char[] s_char = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i =0;i<s_char.length;i++){
            char c = s_char[i];
            
            if(stack.isEmpty()) stack.push(c);
            else{
                if(stack.peek()==c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        
        }
            return stack.isEmpty()? 1:0;
        
        
        
    }

}
