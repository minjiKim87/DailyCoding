import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        //brown+yellow = answer[0]*anwer[1]
        //yellow를 a*b(약수들)의 형식, 그러면 brown은 (a+b)*2+4
       // brown+yellow = 2a+2b+ab+4 = a(b+2)+2(b+2)=(a+2)(b+2);
    
        ArrayList<Integer> arr = new ArrayList<>(); 
        for(int i = 1;i<=(int)Math.sqrt(yellow);i++){
            if(yellow%i==0){
                arr.add(i);    
                arr.add(yellow/i);
            }
        }
        if(arr.size()/2==0){
            arr.add(0);
        }
      
        System.out.println(arr.toString());
          for(int i =0;i<arr.size();i=i+2){
            if(arr.get(i)+arr.get(i+1) == (brown-4)/2){
                answer[0]= arr.get(i+1)+2;
                answer[1]=arr.get(i)+2;
            }
        }
        
        
        return answer;
    }
}