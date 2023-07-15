import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
     
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int tmp=0;
        
        for(int i =0; i<numbers.length; i++){
            int size = queue.size();
            for(int j=0; j<size; j++){
                int cur = queue.poll();
                queue.offer(cur + numbers[i]);
                queue.offer(cur - numbers[i]);
            }
        }
        
        for(Integer n :queue){
           // System.out.println(n);
            if(n==target)
                answer++;
        }
        
        
        return answer;
    }
   
}