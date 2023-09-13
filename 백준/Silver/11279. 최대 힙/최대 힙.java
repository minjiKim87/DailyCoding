import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       int N = Integer.parseInt(br.readLine());
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

       for(int i =0;i<N;i++){
        int x = Integer.parseInt(br.readLine());

        if(x==0){
            Integer tmp = maxHeap.poll();
            System.out.println(tmp==null? 0:tmp);
        }else   
            maxHeap.add(x);
       }
      
       br.close();
        
    }
    
    
}

