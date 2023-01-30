import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        //정순, 역순?
        //food[i]가 짝수가 아니면 짝수로 만들고..
        //fodd[i]들을 전부 더한거-1
        //0, size-1 / 1, size-2로 배치 
        
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i =0 ; i<food.length;i++){
            if(food[i]%2!=0)
                food[i]-=1;
            for(int j=0;j<food[i]/2;j++){
                list.add(Integer.toString(i));
            }
        }     
        
        answer = String.join("", list)+"0";
        Collections.reverse(list);
        answer += String.join("", list);
        
        return answer;
    }
}