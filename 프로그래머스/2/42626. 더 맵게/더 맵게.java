import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0;i<scoville.length;i++){
            minHeap.offer(scoville[i]);
        }
        
        while(true){
            if(minHeap.peek()>=K)
                break;
            
            int m = minHeap.poll();
            int n = minHeap.poll();
            minHeap.offer(m+n*2);
            answer++;
            
            if(minHeap.size()<2 && minHeap.peek()<K){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}