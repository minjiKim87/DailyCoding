import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        //배열 d에서 최대한 많은 수들을 골라서 더한 합이 budget보다 같거나 작아야함
        //역으로 해볼까 
        Arrays.sort(d);
  
        int sum = Arrays.stream(d).reduce(0, (a,b)->a+b);
        System.out.println("Array Sum = "+ sum);
        
        if(sum<=budget)
            return d.length;
      
        for(int i=d.length-1;i>=0;i--){
            
            sum = sum-d[i];
            if(sum<=budget)
                return i;
        }
        
        return answer;
    }
}