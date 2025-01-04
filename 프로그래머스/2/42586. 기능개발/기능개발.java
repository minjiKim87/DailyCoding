import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        
       // printArr(progresses);
     //   printArr(speeds);
        
        int n = speeds.length;
        int[] day = new int[n];
        
        for(int i = 0;i<n;i++){
             day[i] = (100-progresses[i]) / speeds[i];
            
            if(day[i]*speeds[i]+progresses[i]<100)
                day[i]++;
            
            
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = n-1;i>=0;i--){
            stack.push(day[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(!stack.isEmpty()){
            int curr = stack.pop();
            int cnt = 1;
            
            while(!stack.isEmpty() && stack.peek()<=curr){
                stack.pop();
                cnt++;
            }
 
            list.add(cnt);
                
        }
        
       // printArr(day);
        answer = new int[list.size()];
        for(int i =0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    void printArr(int[] arr){
        System.out.println("----");
        System.out.println(Arrays.toString(arr));
    }
}