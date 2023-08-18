import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long num1 = 0;
        long num2 = 0;
        long sum = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(int i=0;i<queue1.length;i++){
            num1 +=(long)queue1[i];
            q1.offer(queue1[i]);
        }
         for(int i=0;i<queue2.length;i++){
            num2 +=(long)queue2[i];
            q2.offer(queue2[i]);
        }
        sum = num1+num2;

        if((int)(sum%2)==1)
            return -1;
        
        sum/=2;
        int a=0;
        int b=0;
        int cnt=0;
        
        while((!q1.isEmpty()) &&(!q2.isEmpty())&&num1!=num2){
            if(cnt>=(queue1.length+queue2.length)*2)
                break;
            if(num1==num2)
                break;
            
            if(num1>num2){
                a=q1.poll();
                q2.add(a);
                num1-=a;
                num2+=a;
                answer++;
            }
            if(num1<num2){
                b=q2.poll();
                q1.add(b);
                num1+=b;
                num2-=b;
                answer++;
            }
            
            cnt++;
        }
        
       if(num1!=num2)
           answer=-1;
        
        return answer;
    }
}