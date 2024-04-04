import java.util.*;

class Pair{
    int p;
    int s;
    
    Pair(int p, int s){
        this.p = p;
        this.s = s;
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Stack<Pair> first = new Stack<>();
        Stack<Pair> second = new Stack<>();
        Queue<Integer> answerQ = new LinkedList<>();
        
        for(int i = 0;i<progresses.length;i++){
            first.add(new Pair(progresses[i], speeds[i]));
        }
        
        while(!(first.isEmpty()&&second.isEmpty())){
            while(!first.isEmpty()){
                Pair pair = first.pop();
                second.add(new Pair(pair.p+pair.s, pair.s));
            }
            
            int cnt=0;
            
            while(!second.isEmpty()){
                Pair pair = second.pop();
                if(pair.p>=100 && first.isEmpty()){
                    cnt++;
                }else{
                    first.add(new Pair(pair.p, pair.s));
                }
            }
            
            if(cnt!=0){
                answerQ.add(cnt);
            }
        }

    
        int idx=0;
        int[] answer = new int[answerQ.size()];
        while(!answerQ.isEmpty()){
            answer[idx]=answerQ.poll();
            idx++;
        }
        
        return answer;
    }
}