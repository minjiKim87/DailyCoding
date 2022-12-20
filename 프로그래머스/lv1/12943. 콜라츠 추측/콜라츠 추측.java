class Solution {
        public static int Collatz(int n, int cnt){
        if(cnt>=500)
            return -1;
        if(n==1){
            return cnt;
        }else{
              cnt++;
        if(n%2==0){
               n=n/2;
          
        }
        else if(n%2==1&&n!=1){
             n=n*3+1;
            
        }          
        }
      
        return Collatz(n, cnt);
    }
    
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        if(num==1)
            return 0;
        answer= Collatz(num, cnt);
        
        
        return answer;
    }
    

}

