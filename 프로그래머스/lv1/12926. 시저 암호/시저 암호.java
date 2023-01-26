
class Solution {
    public String solution(String s, int n) {
        String answer = "";
       
        int temp=0;
       // System.out.println((char)(s.charAt(0)+n));
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                temp = s.charAt(i)+n%26;
                if(s.charAt(i)>=97 && temp>122){ //소문자인데 범위넘으면
                    temp-=26;
                }else if(s.charAt(i)<=90&&temp>90){//대문자인데 범위넘으면
                    temp-=26;
                }
                answer+= (char)(temp);
            }
            else{
                answer += " ";
            }
        }
        
        
        
        return answer;
    }
}