import java.util.*;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class Pair{
    String in;
    String out;
    
    public Pair(String in, String out){
        this.in = in;
        this.out = out;
    }
}

class Solution {
    public int[] solution(int[] fees, String[] records) {
       
        String[] arr = new String[3];
        TreeMap<String, Stack<String>> map = new TreeMap<>();
       // TreeMap<String, LinkedList<String>> mapOut = new TreeMap<>();
        ArrayList<String> carList = new ArrayList<>();
        String key="";
        
        for(int i =0;i<records.length;i++){
            arr = records[i].split(" ");
            key = arr[1];
            Stack<String> values = map.get(key);
            if(values==null){
                values = new Stack<>();
                
            }
            values.push(arr[0]);              
            map.put(key, values);
        }
        
       // System.out.println(map);
        int i=0;
         int[] answer=new int[map.size()];
        for(Map.Entry<String, Stack<String>> entry: map.entrySet()){
           // System.out.println(entry.getKey());
            Stack<String> values = entry.getValue();
            if(values.size()%2!=0){
                values.push("23:59");
            }
          long minutesBetween=0;
           while(values.size()!=0){
                if(values.size()==0)
                    break;
                LocalTime out = LocalTime.parse(values.pop());
                LocalTime in = LocalTime.parse(values.pop());
                
              minutesBetween += ChronoUnit.MINUTES.between(in, out);
               
                
            }
          //  System.out.println("Minutes between: " + minutesBetween);
            
            if(minutesBetween<=fees[0]){
                answer[i]=fees[1];
            }else{
                // System.out.println((minutesBetween-fees[0]));
                // System.out.println((double)(minutesBetween-fees[0])/fees[2]);
                //  System.out.println(Math.ceil((double)(minutesBetween-fees[0])/fees[2]));
                answer[i] = fees[1] + (int)(Math.ceil((double)(minutesBetween-fees[0])/fees[2]))*fees[3];
            }
            
            i++;
            
        }
         
        
        
        return answer;
    }
}