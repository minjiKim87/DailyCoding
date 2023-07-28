import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int[] arr = new int[elements.length*2];
        int m =0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
       for(int i=0;i<elements.length;i++){
           arr[i]=elements[i];
           arr[i+elements.length]=elements[i];
       }
        
       /* for(int i: arr){
            System.out.print(i+" ");
        }
        */
        int sum=0;
        
        for(int i =0;i<elements.length;i++){ // 길이
           
            for(int j=0;j<arr.length-i;j++){ //시작점
                 sum=0;
               for(int k =j;k<i+j;k++){
                   sum+=arr[k];
               }
                set.add(sum);
            }
        }
     
        answer = set.size();
        
        return answer;
    }
}