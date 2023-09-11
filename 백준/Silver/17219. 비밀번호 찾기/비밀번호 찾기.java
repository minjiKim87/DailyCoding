import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       HashMap<String, String> map = new HashMap<>();
      
       for(int i =0;i<N;i++){
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        String address = st2.nextToken();
        String pwd =st2.nextToken();
        map.put(address, pwd);

       }

       for(int i =0;i<M;i++){
        String str = br.readLine();
        
       sb.append(map.get(str)).append('\n');

       }
       System.out.println(sb);
       br.close();
        
    }
    
    
}

