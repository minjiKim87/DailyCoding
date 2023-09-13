import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));

       int N = Integer.parseInt(br.readLine());

       long[] dp = new long[1001];

       dp[1] = 1;
       dp[2] = 2;

       for(int i=3;i<=N;i++){
            dp[i] = (dp[i-2]+dp[i-1])%10007;
       }
      
       System.out.println(dp[N]);
       br.close();
        
    }
    
    
}

