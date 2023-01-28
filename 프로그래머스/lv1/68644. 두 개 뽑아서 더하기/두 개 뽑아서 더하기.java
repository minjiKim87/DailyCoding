import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
    int[] answer={};
        //일단 다 더하고 마지막 결과에서 중복제거하면 될듯
        
        Set<Integer> Set = new TreeSet<Integer>();
        for(int i =0;i<numbers.length-1;i++){
            for(int j =i+1;j<numbers.length;j++){
               Set.add(numbers[i]+numbers[j]);
            }
        }
        
       Integer[] arr= Set.toArray(new Integer[0]);
       answer=Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}