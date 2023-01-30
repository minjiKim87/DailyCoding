import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        //가장 가까운것을 기준으로 재정의
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i =0;i<s.length();i++){
            list.add(s.substring(i,i+1));
        }
        int index=0;

        for(int i=list.size()-1;i>=0;i--){
            index=-1;
            for(int j =0;j<=i-1;j++){
           
                if(list.get(i).equals(list.get(j))){
                  //      System.out.println(list.get(i));
             //  System.out.println(list.get(j));
                   index = j;
                }
            }
            if(index==-1)
                intList.add(-1);
            else
             intList.add(i-index);
                    
        }
        
        Collections.reverse(intList);
        answer = intList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}