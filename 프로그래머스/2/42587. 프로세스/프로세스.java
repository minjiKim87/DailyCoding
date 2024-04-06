import java.util.*;

class Pair{
    int pri;
    int idx;
    
    Pair(int pri, int idx){
        this.pri = pri;
        this.idx = idx;
    }
}



class Solution {
    public int solution(int[] priorities, int location) {
        int answer =0;
        
        Queue<Pair> queue = new LinkedList<>();
        
        for(int i =0;i<priorities.length;i++){
            queue.offer(new Pair(priorities[i], i));
        }
        
        Arrays.sort(priorities);
        int idx=priorities.length-1;
 
        for(int n:priorities){
            System.out.println(n);
        }
        
        while(!queue.isEmpty()){
            Pair cur = queue.poll();
            int curBestPri = priorities[idx];
            if(cur.pri!=curBestPri){
                queue.offer(new Pair(cur.pri, cur.idx));
               
            }else{
                 idx--;
                 answer++;
                if(cur.idx==location){
                    break;
                }
            }
            
           
        }
    
        return answer;
    }
}