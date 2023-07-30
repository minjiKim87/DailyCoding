import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
   
        ArrayList <String> list = new ArrayList<>();

        int wantNum = want.length;
        int num=0;
        for(int i =0;i<number.length;i++){
           num+= number[i];
        }
        int check =0;
        for(int i=0;i<discount.length-num+1;i++){//시작점 
            check=0;
            list.clear();
            for(int j=i;j<i+num;j++){
                list.add(discount[j]);
                //System.out.print(discount[j]+" ");
            }
         //  System.out.println();
           
            for(int j =0;j<wantNum;j++){
             //   System.out.print(want[j]+": "+number[j] +"? "+(Collections.frequency(list, want[j])+" "));
                if(Collections.frequency(list, want[j])!=number[j]){
                    check++;
                    break; 
                }                  
                else{  
                    
                }                
                  
            }
            if(check==0)
                    answer++;
            
        }
    
    
         return answer;
        
}
}