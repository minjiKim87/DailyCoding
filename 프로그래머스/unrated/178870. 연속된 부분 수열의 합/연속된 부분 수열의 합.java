import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        // k = 7;
        int[] answer = {0, sequence.length-1};
        //int[] sequence = {1,1,1,1,1,1,1};

        if(sequence[0] == k) {
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }
        
        Deque<int[]> deque = new ArrayDeque<>();
        Stack<int[]> stack = new Stack<>();
        
        deque.offer(new int[]{sequence[0], 0});
        int sum = sequence[0];
       
        for(int i = sequence.length-1; i > 0; i--){ //>=
            stack.add(new int[]{sequence[i], i});
        }

        while(!stack.isEmpty()) {
          
            if(sum == k) {
                if(answer[1]-answer[0] > deque.peekLast()[1] - deque.peekFirst()[1]) {
                  
                    answer[0] = deque.peekFirst()[1];
                    answer[1] = deque.peekLast()[1];
                }
                sum -= deque.pollFirst()[0];
              
                continue;
            }

            if(sum < k) {
                int[] sPeek = stack.pop();
                deque.offer(sPeek);
                 
                sum += sPeek[0];
              
            } else if(sum>k){
                sum -= deque.pollFirst()[0];
              
            }
            
        }

     
        while(sum > k) {
            if(deque.isEmpty())
                break;
            sum -= deque.pollFirst()[0];
            if(sum == k) {
               
                if(answer[1]-answer[0] > deque.peekLast()[1] - deque.peekFirst()[1]) {
                    answer[0] = deque.peekFirst()[1];
                    answer[1] = deque.peekLast()[1];
                }
            }
        }

        return answer;
    }

}