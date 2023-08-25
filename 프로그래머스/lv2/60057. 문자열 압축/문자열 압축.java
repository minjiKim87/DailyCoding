import java.util.*;

class Solution {
    public int solution(String s) {
        if(s.length()==1)
            return 1;

        int answer = s.length();
        int maxLength = s.length()/2;

        for(int i = maxLength;i>=1;i--){            
             String str = s.substring(0, i);
            StringBuilder compressed = new StringBuilder();
        
            int cnt=1;
        
            for(int j=i;j<s.length();j+=i){
                String str2;
                if(j+i<s.length())
                    str2=s.substring(j, j+i);
                else
                    str2=s.substring(j);

                if(!str.equals(str2)){                            
                  if(cnt>=2)
                      compressed.append(cnt).append(str);
                  else
                      compressed.append(str);

                    cnt = 1;
                    str = str2;

                }else
                    cnt++;
            }  
            
            if(cnt>=2)
                compressed.append(cnt).append(str);
            else
                compressed.append(str);
            
            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}