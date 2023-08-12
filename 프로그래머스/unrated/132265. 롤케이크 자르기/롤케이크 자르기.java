import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer, Integer> Firstmap = new HashMap<>();
        HashSet<Integer> SecondSet = new HashSet<>();
        
        for(int i : topping)
             Firstmap.put(i, Firstmap.getOrDefault(i, 0)+1);
        
       for(int i = topping.length-1;i>=0;i--){
           
           // System.out.println(Firstmap);
           // System.out.println(SecondSet);
           
           int value = Firstmap.get(topping[i]);
           if(value==1)
               Firstmap.remove(topping[i]);
           else
               Firstmap.put(topping[i],value-1);
           
           SecondSet.add(topping[i]);
          
           
           if(Firstmap.size()==SecondSet.size())
               answer++;
           
       }
        
        
        
        
        return answer;
    }
}