import java.util.*;

class Solution {
    ArrayList<int[]> list = new ArrayList<>();
    
    public double[] solution(int k, int[][] ranges) {

        list.add(new int[]{0, k});
        collatz(k);
        int n = list.size();
        int[][] arr = new int[n][];
        for(int i =0;i<list.size();i++){
            arr[i] = list.get(i);
            System.out.print(arr[i][1]+" ");
        }
        System.out.println();
        
        double[] trape = new double[arr.length];
        
        for(int i=0;i<n-1;i++){
              trape[i] = Math.abs((double)(arr[i][1]+arr[i+1][1])/2);
            System.out.println(trape[i]);
        }
        
        double[] answer = new double[n];
        for(int i =0;i<ranges.length;i++){
            int a = ranges[i][0];
            int b = ranges[i][1];
            if(b<=0)
                b = n - ranges[i][1];
            
            if(a<b)
                answer[i] = -1.0;
                
            if(a>b){
                double val = trape[a]-trape[b];
                String str = String.format("%.1f", val);
                answer[i] = (Double.parseDouble(str));
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
            
            list.add(new int[]{list.size(), n});
            if(n==1)
                break;
        }
        
    }
}