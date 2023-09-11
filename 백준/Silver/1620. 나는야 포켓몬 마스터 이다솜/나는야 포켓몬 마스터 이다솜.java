import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
      
       HashMap<String, Integer> nameNum = new HashMap<>();
       HashMap<Integer, String> numName = new HashMap<>();

        String p ="";
       for(int i =0 ; i<N ; i++){
            p = br.readLine();
            nameNum.put(p, i+1);
            numName.put(i+1, p);
       }

       for(int i=0;i<M;i++){
            p = br.readLine();

            try{
                int n = Integer.parseInt(p);
                sb.append(numName.get(n));
                sb.append('\n');
            }catch(NumberFormatException e){
                sb.append(nameNum.get(p));
                sb.append('\n');
            }
       }
       System.out.println(sb);

       br.close();
        
    }
    
    
}

