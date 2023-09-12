import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
    
       int N = Integer.parseInt(br.readLine());
       int[] arr = new int[N];
       int max=0;

       for(int i =0;i<N;i++){
        int n = Integer.parseInt(br.readLine());
        if(max<n)
            max = n;
        arr[i] = n;
       }
        

        int[] dp = new int[max+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

       for(int i =4;i<dp.length;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
      
     
       }

       for(int a : arr){
        System.out.println(dp[a]);
       }
      
       System.out.println(sb);
       br.close();
        
    }
    
    
}

