import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        TreeMap<Integer, List<Integer>> map = new TreeMap<>(Comparator.reverseOrder());
        
        for(int i =0;i<numbers.length;i++){
            int key = numbers[i];
            while(key>=10){
                key/=10;
            }
            
            List<Integer> values = map.get(key);
            if(values==null){
                values = new ArrayList<>();
            }
            values.add(numbers[i]);
            map.put(key, values);
        }
        
        //System.out.println(map);
        
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> values = entry.getValue();
            Collections.sort(values, Collections.reverseOrder());
            
        
            if(values.size()==1){
                answer+=values.get(0);
            }         
            else{
            String[] strArr = values.stream().map(String::valueOf).toArray(String[]::new);
            Arrays.sort(strArr, (a, b)->(b+a).compareTo(a+b));
                      
            answer+=(String.join("", strArr));
            }
            
        }
        
        
        if(answer.replaceAll("0","").isEmpty()){
            answer="0";
        }
        
        return answer;
    }
}