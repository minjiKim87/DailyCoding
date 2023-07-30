import java.util.*;
import java.lang.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        double union=0;
        double intersection=0;
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> arrayList1 = new ArrayList<String>();
            List<String> arrayList3 = new ArrayList<String>();
            List<String> arrayList5 = new ArrayList<String>();
        List<String> arrayList2 = new ArrayList<String>();
            List<String> arrayList4 = new ArrayList<String>();
            List<String> arrayList6 = new ArrayList<String>();
        
        
        String tmp="";
        for(int i =0;i<str1.length()-1;i++){
            if(Character.isAlphabetic(str1.charAt(i)) && Character.isAlphabetic(str1.charAt(i+1))){
                tmp=String.valueOf(str1.charAt(i))+String.valueOf(str1.charAt(i+1));
                  // System.out.println(tmp);                          
                arrayList1.add(tmp);  
            }
                         
        }
        
          for(int i =0;i<str2.length()-1;i++){
            if(Character.isAlphabetic(str2.charAt(i)) && Character.isAlphabetic(str2.charAt(i+1))){
                tmp=String.valueOf(str2.charAt(i))+String.valueOf(str2.charAt(i+1));
                  // System.out.println(tmp);                          
                arrayList2.add(tmp);  
            }                         
        }
        
        if(arrayList1.isEmpty()&&arrayList2.isEmpty()){
            return 	65536;
        }
        
        List<String> joined = new ArrayList<>();
        joined.addAll( arrayList1);
        joined.addAll( arrayList2);
        
//         System.out.println(arrayList1);
//          System.out.println(arrayList2);
//         System.out.println(joined);
     
        
        ///
        Set<String> set = new HashSet<String>(joined);
        union=0;
        
        
        int n1=0;
        int n2=0;
        List<String> k = new ArrayList<>(set);
        
        for(int i =0;i<set.size();i++){
   
            n1 = Collections.frequency(arrayList1, k.get(i));
            n2 = Collections.frequency(arrayList2, k.get(i));
            
                   
            
            if(n1>0&&n2>0){
                intersection+=(double)Math.min(n1, n2);
                union+=(double)Math.max(n1, n2);
            }else if(n1>0&&n2<=0){
                union+=(double)n1;
            }else if(n1<=0&&n2>0){
                union+=(double)n2;
            }
             // System.out.println(k.get(i) +" : "+n1+", "+n2+"=> "+intersection+", "+union);
            
        }
           answer=(int)((intersection/union)*65536);
        // System.out.println("intersection : "+intersection+" union : "+union);
        // System.out.println(answer);
        
     
        return answer;
    }
}