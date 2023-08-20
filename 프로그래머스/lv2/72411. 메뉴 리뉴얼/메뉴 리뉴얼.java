import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>();
        int customerNum = orders.length;
      
        
        for(int i =0;i<course.length;i++){
              
            HashMap<String, Integer> map = new HashMap<>();
           
            
            for(int j =0;j<orders.length;j++){
                char[] order = orders[j].toCharArray();
                Arrays.sort(order);
                String o = new String(order);
                
                if(o.length()<course[i])
                    continue;                
                else if(o.length()==course[i]){
                    if(map.containsKey(o)){
                       map.put(o, map.get(o)+1);
                    }else{
                        map.put(o, 1);
                    }
                }else{
                    
                   
                    func(course[i], o, map, "", 0);
                }
               
            }
            //System.out.println(map);
            
            int max = 0;
            for(String key: map.keySet()){
                if(map.get(key)>=2 && max<map.get(key)){
                   max = map.get(key);
                }           
            }
            for(String key : map.keySet()){
                if(map.get(key)==max)
                    answerList.add(key);
            }
            
        }
        
        //System.out.println(answerList);
        Collections.sort(answerList);
        String[] answer = answerList.toArray(new String[answerList.size()]);
     
        return answer;
    }
    
    
    public void func(int c, String o,  HashMap<String, Integer> map, String str, int index){
   
        if(str.length() == c){
            //System.out.println(str);
            if(map.containsKey(str)){
                 map.put(str, map.get(str)+1);
            }else{
                map.put(str, 1);
            }
            return;
        }
        if(index>=o.length())
            return;
        
        func(c, o, map, (str+o.charAt(index)), index+1);
        func(c, o, map, str, index+1);
    }
}