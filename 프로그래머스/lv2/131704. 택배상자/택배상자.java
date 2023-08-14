import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> subStack = new Stack<>();
        
        ///
        int check=0;
        for(int i =0;i<order.length-1;i++){
            if(!(Math.abs(order[i]-order[i+1])==1))
                check++;
        }
        if(check==0)
            return order.length;
        
        ///
        
        for(int i = order.length;i>=1;i--){
            mainStack.add(i);
        }
        
        for(int i =0;i<order.length;i++){
            //System.out.println("i : "+i+", order : "+order[i]);
         
            if(!mainStack.isEmpty()&&mainStack.peek()==order[i]){
                mainStack.pop();
                answer++;
            }
            else if(!subStack.isEmpty()&&subStack.peek()==order[i]){
                subStack.pop();
                answer++;
            }else{
                if(!mainStack.isEmpty() && order[i]<mainStack.peek()){
                    if(!subStack.isEmpty()&&order[i]!=subStack.peek())
                        break;
                }
                   
                
                while(!mainStack.isEmpty() && order[i]!=mainStack.peek()){
                    subStack.add(mainStack.pop());
                }
                
                if(!mainStack.isEmpty()&&mainStack.peek()==order[i]){
                mainStack.pop();
                answer++;
                }
            }
              
            }
          
         
        // while(!mainStack.isEmpty()){
        //     System.out.print(mainStack.pop());
        // }
        // System.out.println();
        // while(!subStack.isEmpty()){
        //     System.out.print(subStack.pop());
        // }
        
        
       
        
        return answer;
    }
}