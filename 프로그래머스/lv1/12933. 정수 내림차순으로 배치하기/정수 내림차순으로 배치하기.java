import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
    long answer;
        String s = Long.toString(n); //int n을 String으로 변환
       char[] arr =new char[s.length()];
        
        for(int i=0; i<s.length(); i++){
            arr[i]= s.charAt(i);
        }
        String ans="";
        Arrays.sort(arr);
        for(int i= s.length()-1;i>=0;i--){
            ans+=arr[i];
            }
        answer = Long.parseLong(ans);
        return answer;
    
    
}
}