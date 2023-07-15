import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0;i<scoville.length;i++){
            minHeap.add(scoville[i]);
        }
        
        int mix = 0;
        
        while(minHeap.peek()<K){
        mix = minHeap.poll() + minHeap.poll()*2;
        minHeap.add(mix);
        answer++;
            
        if(minHeap.size()<2 && minHeap.peek()<K){
            answer=-1;
            break;
        }
            
        }
        
        
        return answer;
    }
}