import java.util.*;
class Solution {
    public long solution(long n) {
        
        Double result = Math.sqrt(n);
        if(result==result.intValue())
               return (long)Math.pow(result + 1, 2);
      else return -1;
    }
}