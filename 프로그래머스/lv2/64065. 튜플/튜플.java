import java.util.*;

class Solution {
    public int[] solution(String s) {

    
        s = s.substring(2, s.length()-2);

        String[] arr = s.split("\\},\\{");
          
        // for(int i =0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
              
            String[] tmp = new String[(arr[i].length()+1)/2];
            tmp = arr[i].split(",");
            List<Integer> list = new ArrayList<>();
            for(String value : tmp){
                list.add(Integer.valueOf(value));
            }
        
            map.put(tmp.length, list);
            
            // System.out.println(map);
     
        }
        
        //Set<Integer> keys = map.keySet();
        List<Integer> keysList = new ArrayList<>(map.keySet());
        List<Integer> newList = new ArrayList<>();
        
        
        for(Integer key : keysList){
            List<Integer> values = map.get(key);
            for(Integer value : values) {
                if(!newList.contains(value)) {
                    newList.add(value);
                }
            }
        }
        
     int[] answer = newList.stream().mapToInt(i -> i).toArray();
return answer;

         
     
    }
}