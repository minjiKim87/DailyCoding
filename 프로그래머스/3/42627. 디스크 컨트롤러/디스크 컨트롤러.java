import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        Arrays.sort(jobs, (o1, o2)->o1[0]-o2[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2)->o1[1]-o2[1]);
        
        int count = 0;
        int sum = 0;
        int currentTime = 0;
        int index = 0;
        
        while(count<jobs.length){
            while(index<jobs.length && jobs[index][0]<=currentTime){
                pq.offer(jobs[index++]);
            }
            
            if(pq.isEmpty()){
                currentTime = jobs[index][0];
            }else{
                int[] job = pq.poll();
                currentTime += job[1];
                sum+=currentTime-job[0];
                count++;
            }
        }
        
        answer = sum / jobs.length;
        return answer;
    }
}