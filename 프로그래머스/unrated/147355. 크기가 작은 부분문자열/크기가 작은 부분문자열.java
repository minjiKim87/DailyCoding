class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength=p.length();
        
        for(int i=0;i<t.length()-pLength+1;i++){
      
            
          //  System.out.println(temp);
            if(Long.parseLong(t.substring(i, i+pLength))<=Long.parseLong(p))
                answer++;
        }
        
        return answer;
 
    }
}