import java.util.*;

class Pair implements Comparable<Pair>{
    int priority;
    int value;
    
    public Pair(int priority, int value){
        this.priority = priority;
        this.value=value;
    }
    
    @Override
    public int compareTo(Pair pair){
        return pair.priority-this.priority;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer =0;
        
        Queue<Pair> queue = new LinkedList<>();
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
       List<Integer> list = new ArrayList<>();
        
        
        
        for(int i=0;i<priorities.length;i++){
            queue.add(new Pair(priorities[i], i));
            priorityQueue.add(priorities[i]);
        }
          while(!queue.isEmpty()){
            Pair pair =queue.poll();
            //System.out.println(pair.priority + " " + pair.value); 
              
              if(pair.priority == priorityQueue.peek()){
                  list.add(pair.value);
                  priorityQueue.poll();
              }else{
                  queue.add(new Pair(pair.priority, pair.value));
              }
             
           
        }
        
        // while(!priorityQueue.isEmpty()){
        //     System.out.println(priorityQueue.poll());
        // }
        
        
        answer = list.indexOf(location)+1;
     
        
    
        return answer;
    }
}