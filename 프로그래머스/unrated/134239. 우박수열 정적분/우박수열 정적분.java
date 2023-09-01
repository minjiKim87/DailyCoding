import java.util.*;

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    
    public double[] solution(int k, int[][] ranges) {

        list.add(k);
        collatz(k);
        int n = list.size();
               
        double[] answer = new double[ranges.length];
             
        
        int[] arr = new int[n+1];
        for(int i =0;i<n;i++){
            arr[i] = list.get(i);
            //System.out.print(arr[i]+" ");
        }
       // System.out.println();
        
        double[] trape = new double[n];
        
        for(int i=0;i<n;i++){
              trape[i] = Math.abs((double)(arr[i]+arr[i+1])/2);
            //System.out.println(trape[i]);
        }
        
         double[] prefixSum = new double[n];
        prefixSum[0] = trape[0];
        for(int i=0; i<n-1; i++){
            prefixSum[i+1] = (trape[i] + prefixSum[i]);
            //System.out.println(prefixSum[i+1]);
        }
 
        
         for(int i=0; i<ranges.length; i++){
            int s = ranges[i][0];
            int e = n-1 + ranges[i][1];

            if(e > s){
                double val = prefixSum[e] - prefixSum[s];
                String str = String.format("%.1f", val);
                answer[i] = (Double.parseDouble(str));
            }else if(s > e){
                answer[i] = -1.0;
            }else{
                answer[i] = 0.0;
            }
        }
        
        return answer;
    }
    
    public void collatz(int n){

        while(n>0){
            
            if(n%2==0)
                n/=2;
            else
                n=3*n+1;
            
            list.add(n);
            if(n==1)
                break;
        }
        
    }
}