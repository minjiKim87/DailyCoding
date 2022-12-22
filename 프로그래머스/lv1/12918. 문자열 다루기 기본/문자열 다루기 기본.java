class Solution {
    public boolean solution(String s) {
        char check;
        if(s.length()!=4 && s.length()!=6)
            return false;
        
        for(int i =0 ; i<s.length();i++){
            check = s.charAt(i);
             if((int)check<48||(int)check>57){
                return false;
            }
        }
        
    
        return true;
    }
}