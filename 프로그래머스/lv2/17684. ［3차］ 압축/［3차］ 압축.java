import java.util.*;

class Solution {

    public int[] solution(String msg) {
        int[] answer = {};


        String[] arr = msg.split("");
        List <Integer> answerList = new ArrayList<Integer>();
 
        HashMap<String, Integer> map = new HashMap<>();
        for(int i =1;i<=26;i++){
            map.put(Character.toString(65+i-1),i);
        }
    //    System.out.println(map);
        
        Set keyList = map.keySet();
        String str="";
        int index=27;
        
        for(int i=0;i<arr.length;){
           // System.out.println(map);
            str="";
            int j=0;
                
            if(keyList.contains(arr[i])){
                str+=arr[i];      
                j++;                    
                while(i+j<arr.length){
                    if(keyList.contains(str+arr[i+j])){
                         str+=arr[i+j];
                    j++;
                    }else{
                         break;
                    }
                       
                   
                }                
            }
     

             
            if(i+j < arr.length) {
               // System.out.println(str); // answer에 넣어야 
                  answerList.add(map.get(str));
                String tmp=str+arr[i+j];
                //System.out.println(tmp);
                map.put(tmp,index);
                index++;
            }
            i = i+j;
            
  
             if(i == arr.length && !str.isEmpty()) {
                 System.out.println(str);
                 answerList.add(map.get(str));
            //System.out.println(map.get(str));
        }
        }
        
        answer = answerList.stream().mapToInt(i->i).toArray();
        return answer;
    }




}
