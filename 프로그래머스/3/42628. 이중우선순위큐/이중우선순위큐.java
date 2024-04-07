import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
      
        
        PriorityQueue<Integer> max  = new PriorityQueue(Collections.reverseOrder());
        PriorityQueue<Integer> min  = new PriorityQueue<>();
        
        for(String op : operations){
            StringTokenizer st = new StringTokenizer(op);
            char judge = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());
            
            switch(judge){
                case 'I':
                    min.add(num);
                    max.add(num);
                    break;
                case 'D':
                    if(max.isEmpty()) break;
                    if(num==1){
                        int del = max.poll();
                        min.remove(del);
                    }
                    if(num==-1){
                        int del = min.poll();
                        max.remove(del);
                    }
            }
        }
        
        if(max.isEmpty())
            return new int[]{0, 0};
        
        
        int[] answer = {max.peek(), min.peek()};
        
        return answer;
    }
}