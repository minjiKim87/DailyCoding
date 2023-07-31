import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> list = new ArrayList<>();
        String[][] info = new String[record.length][];
        
        for(int i=0;i<record.length;i++){
            info[i] = record[i].split(" ");
        }

        
        HashMap<String, String> map = new HashMap<String, String>();
        
        for(int i =0;i<record.length;i++){
            if(info[i][0].equals("Enter")||info[i][0].equals("Change")){
                map.put(info[i][1], info[i][2]);
            }
        }
        String uid="";
        String name="";
        String str="";
        for(int i =0;i<record.length;i++){
            if(!info[i][0].equals("Change")){
                 uid= info[i][1];
            name = map.get(uid);            
            str=name+"님이 ";
            if(info[i][0].equals("Enter")){
                str+="들어왔습니다.";
            }else if(info[i][0].equals("Leave")){
                str+="나갔습니다.";
            }
                   list.add(str);
            }
         
        }

        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}