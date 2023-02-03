class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int left=0;
        int right=0;
        
        if(s.charAt(0)==')'||s.charAt(s.length()-1)=='(')
            return false;
        int temp =1;
        
        for(int i =0;i<s.length();i++){
             if(left==right){
                left=0;
                right=0;
                 temp=0;
            }
            
            if(s.charAt(i)=='('){
                left++;
            }else{
                right++;
            }
            
            if(temp==0&&left==0&&right>0){
                answer=false;
            }
           
        }
        if(left!=right)
            answer=false;
        return answer;
    }
}