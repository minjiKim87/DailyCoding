import java.util.*;
class Pair{
    int value;
    int idx;
    
    public Pair(int value, int idx){
        this.value = value;
        this.idx = idx;
    }
}

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Pair> queue = new LinkedList<>();
        
        queue.offer(new Pair(numbers[0], 0));
        queue.offer(new Pair(-numbers[0], 0));
        
        
        while(!queue.isEmpty()){
          Pair curr = queue.poll();
            if(curr.idx+1>=numbers.length){
                break;
            }
            
            queue.offer(new Pair(curr.value+numbers[curr.idx+1], curr.idx+1));
            queue.offer(new Pair(curr.value-numbers[curr.idx+1], curr.idx+1));
                
        }
        
        while(!queue.isEmpty()){
            if(queue.poll().value==target){
                answer++;
            }
        }
        
        return answer;
    }
}