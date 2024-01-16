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

       Queue<Integer> queue = new LinkedList<>();

       for(int i =1;i<=N;i++){
        queue.add(i);
       }

       int cnt=0;
       sb.append("<");
       while(!queue.isEmpty()){
        cnt++;
        if(cnt!=K){
            
            queue.add(queue.poll());
           
        }else{
            cnt=0;
           sb.append(queue.poll());
           if(queue.size()!=0){
            sb.append(", ");
        }
        }
        
       
       
       }

       sb.append(">");
       System.out.println(sb.toString());

      
       br.close();
        
    }
    
    
}

