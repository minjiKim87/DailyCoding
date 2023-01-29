import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
       
       ArrayList<Integer> answer = new ArrayList<>();
        /*
        5자리, 8자리, 10자리 반복
        최소공배수 40... 표를 만들어서 체크하나
        아님 string으로 합쳐서 charAt 채점
        그냥 40개짜리말고 따로따로 해놓고 채점할때 숫자로 나누기, 나머지
        */
        String one = "12345";
        String two="21232425";
        String three = "3311224455";
        int[] arr={0,0,0};
        for(int i =0;i<answers.length;i++){
            if(answers[i] ==one.charAt(i%5)-'0'){
              arr[0]++;
          }
            if(answers[i] == two.charAt(i%8)-'0'){
              arr[1]++;
          }
               if(answers[i] == three.charAt(i%10)-'0'){
              arr[2]++;
          }
                
        }
        System.out.println(arr[0]);
                   System.out.println(arr[1]);
   System.out.println(arr[2]);
        //모두 0점일때도 포함...
        int max=0;
        answer.add(0); // 바운더리 쿠션?값
        //만약에 맞은게 2개, 2개 3개 이런경우..
        for(int i =0;i<3;i++){
            if(max<arr[i]){
                max=arr[i];
            answer.clear(); 
               answer.add(i+1);
            }else if(max==arr[i]){
                answer.add(i+1);
            }
            
        }
        
        answer.removeIf(i->i == 0);
        int[] intArray = answer.stream().mapToInt(i -> i).toArray();
        
        return intArray;
    }
}