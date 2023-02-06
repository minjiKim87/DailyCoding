import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
    
        int check=0;
        //공백두번 말고, 공백아님&공백 조합일때만.
        if(s.charAt(s.length()-1)==' '&&s.charAt(s.length()-2)!=' '){
            check=1;
        }
   
        String[] splitStr = s.replace(" ", "!,").split(","); 
       // 오 이게 공백 여러개는 인식하는데 하나는 인식을 못하네?
        /*
        공백 하나는 아예 없어지고
        공백 두개는 그대로 두개가 들어감..*/
       
        String temp="";
          for(int i =0;i<splitStr.length;i++){
              if(splitStr[i].charAt(0)=='!'){
                  
                  answer+=" ";
              }else{
                   temp = String.valueOf(splitStr[i].charAt(0)).toUpperCase()+splitStr[i].substring(1).toLowerCase();
            answer+=temp;
              if(i!=splitStr.length-1)
                  answer+=" ";
              }
           
        }
        
     
        
        answer = answer.replace("!","");
        if(check==1)
            answer+=" ";
        return answer;
    }
}