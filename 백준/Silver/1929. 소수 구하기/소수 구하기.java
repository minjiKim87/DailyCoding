import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int M = Integer.parseInt(st.nextToken());
       int N = Integer.parseInt(st.nextToken());

       for(int i=M;i<=N;i++){
        if(check(i)){
            System.out.println(i);
        }
       }
      
       br.close();
        
    }

    public static boolean check(int n){
        int t = (int)Math.sqrt((double)n);
       // System.out.println("n, t :"+n+","+t);
       if(n==1)
       return false;
        if(n==2||n==3)
            return true;

        for(int i=2;i<=t;i++){
           // System.out.println("i"+ i);
            if(n%i==0){
                //System.out.println("f");
                return false;
            }
                
        }

        return true;
    }
    
    
}

