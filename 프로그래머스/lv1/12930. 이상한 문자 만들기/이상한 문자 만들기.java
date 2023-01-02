import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        //s =  " TrY HeLlO WoRlD ";
        int cnt=0;
        //s="ee a    q";
        String[] strArr =  s.split("\\s",-1);
        System.out.println(Arrays.toString(strArr));
        String temp="";
        
        for(int i =0;i<strArr.length;i++){
            temp="";
            if(strArr[i]!="\\s"){
                     for(int j=0;j<strArr[i].length();j++){
               
                if(j%2!=0){
                    temp+=Character.toString(Character.toLowerCase(strArr[i].charAt(j))); 
                }else if(j%2==0){
                    temp+=Character.toString(Character.toUpperCase(strArr[i].charAt(j)));
                }
                         
            }
                
       
              
            }
            else{
                temp="\\s";
            }
              strArr[i] = temp;
        }
        
        answer = String.join(" ", strArr);
        return answer;
    }
}