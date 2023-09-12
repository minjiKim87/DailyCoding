import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       int T = Integer.parseInt(br.readLine());
       int max=0;
       int[] arr = new int[T+1];
        arr[0]=0;
       for(int i =1; i<=T; i++){
           int N = Integer.parseInt(br.readLine());
           if(max<N)
            max=N;
            arr[i] = N;
       }

       long[] dp = new long[max+1];
       dp[0]=0;
       dp[1]=1;
       if(max!=1){
        dp[2]=1;
        for(int i =3;i<=max;i++){
            dp[i] = dp[i-3]+dp[i-2];
        }
       }

       for(int a : arr){
        if(a!=0)
        System.out.println(dp[a]);
       }
  
    //    for(int d : dp){
    //     System.out.print(d+" ");
    //    }
       

      
       br.close();
        
    }
    
    
}

