class Solution {
    public String solution(String p) {
        String answer = "";
        if(p.length()==0)
            return answer;

        answer = funcRecursion(p);
        
        return answer;
    }
    
    public String funcRecursion(String str){
         if (str.equals("")) return "";
        
        String[] uv = funcBalance(str);
        
        if(funcRight(uv[0])){
            return uv[0]+funcRecursion(uv[1]);
        }else{
            String temp = "(" + funcRecursion(uv[1]) + ")";
            uv[0] = uv[0].substring(1, uv[0].length() - 1);
          
            for (int i = 0; i < uv[0].length(); i++) {
                if (uv[0].charAt(i) == '(') temp += ")";
                else temp += "(";
            }
            return temp;
        }
        

    }
    
    public String[] funcBalance(String p){
         int balance=0;
        String[] uv = new String[2];
          char[] charArr = p.toCharArray();
        
        for(int i =0;i<charArr.length;i++){
            if(charArr[i]=='(')
                balance++;
            else
                balance--;
            
            if(balance==0){
                uv[0] = p.substring(0, i+1);
                uv[1] = p.substring(i+1);
                break;
            }                
        }
        
        return uv;
    }
    
    public boolean funcRight(String str){
        
         int balance = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') balance++;
            else balance--;

            if (balance < 0) return false;
        }
        return true;
    }
    
    
}