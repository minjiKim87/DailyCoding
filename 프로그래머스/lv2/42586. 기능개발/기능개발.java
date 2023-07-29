import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
//          int[] progresses2 = {20,99,93,30,55,10};
//          int[] speeds2 = {5,10,1,1,30,5};
//          progresses = progresses2;
//         speeds = speeds2;
        
        
        /////
        int[] answer = new int[progresses.length];
 
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        int tmp=0;
        for(int i =progresses.length-1;i>=0;i--){
           tmp = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0){
                tmp++;
            }
            stack.push(tmp);   
        }
        
//        while(!stack.empty()){
//             System.out.println(stack.pop());
//         }
       
        stack2.add(stack.pop()); // 맨 처음 것
        int k =0;
        answer[k]++;
        int check =0;
        
        while(true){
            if(stack.empty())
                break;
            
            int before = stack2.peek();
            int now = stack.peek();
            
            check =  before>=now ? 0 : -1;
            
            //System.out.println("before : "+before+", now : "+now+", check : "+check);
            
            if(check == -1){
                stack2.pop();
                stack.pop();
                stack2.add(now);
                k++;
                answer[k]++;
            }else{
                stack.pop();
                answer[k]++;
            }
        }
        
    
        
        answer = Arrays.copyOf(answer, k+1);
        
    
        return answer;
    }
}