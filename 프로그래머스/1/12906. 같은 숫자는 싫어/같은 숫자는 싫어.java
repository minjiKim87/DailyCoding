import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
     
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]!=stack.peek()){
               // System.out.println(arr[i]);
                stack.push(arr[i]);
            }    
        }
        
        int[] answer = new int[stack.size()];
        int idx = stack.size()-1;
        while(!stack.isEmpty()){
            answer[idx]=stack.pop();
            idx--;
        }
        
       
       
        return answer;
    }
}