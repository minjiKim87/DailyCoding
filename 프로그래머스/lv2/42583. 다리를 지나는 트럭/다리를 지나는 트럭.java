import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Stack<Integer> s = new Stack<Integer>();//대기 스택 
        Queue<int[]> q = new LinkedList<>(); // 트럭 무게, 들어가는 시간
        
        for(int i= truck_weights.length-1;i>=0;i--){
            s.push(truck_weights[i]);
        }
        
        int currWeight = 0;
     
        
        while(!s.isEmpty() || !q.isEmpty()){
            //형식 :    int[] pass = q.poll(); pass[0], pass[1]
            answer++;
            
            //맨 앞 트럭 나감            
            if(q.size()!=0 && (answer-q.peek()[1])==bridge_length){
                currWeight -= q.peek()[0];
                q.poll();
            }
            
            //새로운 트럭 들어옴
            if(!s.isEmpty() && s.peek()+currWeight<=weight){
                currWeight += s.peek();
                q.offer(new int[]{s.pop(), answer});              
            }
         
          
          
        }
        
       
        
        return answer;
    }
}