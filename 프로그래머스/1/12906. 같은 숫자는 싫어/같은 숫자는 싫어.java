import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        
         Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
       // System.out.println(stack.peek());
        for(int a : arr){
            if(a!=stack.peek()){
          //      System.out.println(a);
                stack.add(a);
            }
        }
        
        answer = new int[stack.size()];
        
        for(int i = stack.size()-1;i>=0;i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}