import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String arith = Integer.toString(n, k);      
        String tmpNum = "";

        
        String[] arr = arith.split("0");

        
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty()){
            long num = Long.parseLong(arr[i]);
            if(isPrime(num)){
                System.out.println(arr[i]);
                  answer++;
               }      
            }
        }

        return answer;

    }


    static boolean isPrime(long num){
      
  
        if(num==1)
            return false;
        if(num==2)
            return true;
        
        for(int i =2;i<=(long)Math.sqrt(num)+1;i++){
            if(num%i==0){
                return false;
            }          
        }
       
        return true;
       

    }

}