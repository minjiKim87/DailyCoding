import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        for(Integer i : arr){
            if(arrayList.get(arrayList.size()-1)!=i)
                arrayList.add(i);
        }
        
        arrayList.remove(0);
        int[] answer = arrayList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}