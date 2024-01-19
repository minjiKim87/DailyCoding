import java.io.*;
import java.util.*;

public class Main{
    static int[] stair;
    static int[] dp;
    static int N;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
   
        stair= new int[N+1];
        dp = new int[N+1];

        stair[0]=0;
        dp[0] = 0;

      

        for(int i =1;i<N+1;i++){
            int n = Integer.parseInt(br.readLine());
            stair[i] = n;
        }

        if(N>=1){
            dp[1] = stair[1];

        }
        if(N>=2){
            dp[2] = stair[1]+stair[2];
        }
      
        for(int i =3;i<=N;i++){
          //  dp[i] = Math.max(dp[i-1]+stair[i-1], dp[i-2]+stair[i-2]);
          dp[i] = Math.max(stair[i-1]+dp[i-3],dp[i-2])+stair[i];

        }

        // for(int d : dp){
        //     System.out.println(d);
        // }

      System.out.println(dp[N]);

       br.close();
        
    }
    

    
}

