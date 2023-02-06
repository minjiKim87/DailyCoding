class Solution {
    public int solution(int n) {
        int answer = 0;
        int next=n;        
        String nbinary = Integer.toBinaryString(n);
        String binary="";
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i =0;i<nbinary.length();i++){
            if(nbinary.charAt(i)=='1'){
                cnt1++;
            }
        }
             
        while(true){
            cnt2=0;
            next+=1;
            binary=Integer.toBinaryString(next);
            
            for(int i =0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                cnt2++;
            }
            }
                  
            if(cnt1==cnt2){
                answer = next;
                break;
            }
            
        }
       
    
        return answer;
    }
}