import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        //target - or + numbers 해서 0이되면 방법 bfs 로 하자 
        
        printArr(numbers);
        answer = BFS(numbers, target);
        
        return answer;
    }
    
    public int BFS(int[] numbers, int target){
        
        Queue<Integer> q = new LinkedList<Integer>();
        int cnt =0;
        
        q.offer(target-numbers[0]);
        q.offer(target+numbers[0]);
        
            int curr;
 
        
        Stack<Integer> stack = new Stack<>();
        
        for(int idx=1;idx<numbers.length;idx++){
             while(!q.isEmpty()){
                    curr = q.poll();
                 
                 stack.add(curr-numbers[idx]);
                    stack.add(curr+numbers[idx]);
              
            }
        
            while(!stack.isEmpty()){
                q.offer(stack.pop());
            }
        }
        
        while(!q.isEmpty()){
            if(q.poll()==0)
                cnt++;
        }
        
        
        
        return cnt;
        
        
    }
    
    void printArr(int[] arr){
        System.out.println("-----");
        
        for(int n : arr){
            System.out.print(n+ " ");
        }
    }
}