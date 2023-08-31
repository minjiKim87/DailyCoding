import java.util.*;

class Solution {
    ArrayList<Integer> divA = new ArrayList<Integer>();
    ArrayList<Integer> divB = new ArrayList<Integer>();
    
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = Integer.MIN_VALUE;
        int gcdA = gcd2(arrayA);
        int gcdB = gcd2(arrayB);
        
        //  if(func(gcdA, arrayB)){
        //     return gcdA;
        // }else if(func(gcdB, arrayA)){
        //     return gcdB;
        // }
                
        div(gcdA, 1);        
        div(gcdB, 0);
      
       for(int i=0;i<divB.size();i++){
           int n = divB.get(i);
           boolean check = true;
           for(int j =0;j<arrayA.length;j++){
               if(arrayA[j]%n==0){
                   check = false;
                   break;
                     
               }
           }
           
           if(check){
               //System.out.println(n);
               answer = Math.max(n, answer);
               break;
           }
       }
  
        for(int i=0;i<divA.size();i++){
           int n = divA.get(i);
           boolean check = true;
           for(int j =0;j<arrayB.length;j++){
               if(arrayB[j]%n==0){
                   check = false;
                   break;
                     
               }
           }
           
           if(check){
               //System.out.println(n);
               answer = Math.max(n, answer);
               break;
           }
       }
        
        if(answer == Integer.MIN_VALUE)
            answer = 0;
     
        return answer;
    }
    
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public static int gcd2(int[] arr){
        int gcd = arr[0];
    
        for(int i = 1; i < arr.length; i++){
            gcd = gcd(gcd, arr[i]);
        }

        return gcd;
    }
    
    public void div(int num, int a){
        for(int i = num;i>=1;i--){
            if(num%i==0){
                if(a==1)
                    divA.add(i);
                else
                    divB.add(i);
            }
                
        }
    }
    
//     public boolean func(int gcd, int[] arr){
      
//          boolean check = true;
//          for(int i=0;i<arr.length;i++){
//              if(arr[i]%gcd==0){
//                  check = false;
//                 break;
//              }
//          }          
           
//        return check;
//     }
    

   
}