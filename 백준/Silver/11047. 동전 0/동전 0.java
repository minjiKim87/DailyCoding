import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int K = Integer.parseInt(st.nextToken());

       int[] arr = new int[N];
  
       for(int i =0;i<N;i++){
        int n = Integer.parseInt(br.readLine());
        arr[i] = n;
       }

       int answer=0;
       for(int i = N-1;i>=0;i--){
        //System.out.println(answer);
            if(arr[i]<=K){
                answer += (K/arr[i]);
                K = K%arr[i];
            }
      
       }

        System.out.println(answer);
       br.close();
       
        
        
    }
    
    
}

