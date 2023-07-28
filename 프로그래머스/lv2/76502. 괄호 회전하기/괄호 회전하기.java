import java.util.*;

class Solution {
    public int solution(String s) {
        int answer =0;
 
        String str = s+s;
        String strCheck="";
        
        List<Character> leftList = Arrays.asList('{','[','(');
        List<Character> rightList = Arrays.asList('}',']',')');
        List<Character> list = Arrays.asList('{','[','(',')',']','}');
       
        for(int i=0;i<str.length()-s.length();i++){
            strCheck = str.substring(i, i+s.length());
           // System.out.println(strCheck);
              if(checkString(strCheck)) answer++;

        }
        return answer;

    }
    
     boolean checkString(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            try{
                switch(s.charAt(i)){
                    case '[': 
                        stack.add('[');
                        break;
                    case ']':
                        if(stack.peek() != '[') return false;
                        stack.pop();
                        break;
                    case '{': 
                        stack.add('{');
                        break;
                    case '}':
                        if(stack.peek() != '{') return false;
                        stack.pop();
                        break;
                    case '(': 
                        stack.add('(');
                        break;
                    case ')':
                        if(stack.peek() != '(') return false;
                        stack.pop();
                        break;
                }
            } catch(Exception e){
                return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}

