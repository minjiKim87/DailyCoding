import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
      
       
       int N = Integer.parseInt(br.readLine());
       PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
        if(a[0]==b[0]){
            return a[1]-b[1];
        }
        return a[0]-b[0];
       });

       for(int i =0;i<N;i++){
        int n = Integer.parseInt(br.readLine());
        if(n!=0){
            pq.offer(new int[]{Math.abs(n), n});
        }
        if(n==0){
            if(pq.isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(pq.poll()[1]);
            }
        }

       }
      
       br.close();
        
    }
    
    
}

