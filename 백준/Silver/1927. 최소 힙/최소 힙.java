import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //  BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       int N = Integer.parseInt(br.readLine());
       PriorityQueue<Integer> minHeap = new PriorityQueue<>();

       for(int i =0;i<N;i++){
        int x = Integer.parseInt(br.readLine());
        if(x==0){
            Integer tmp = minHeap.poll();
            System.out.println(tmp==null? 0 : tmp);
        }
           
        else
            minHeap.add(x);
       }
       
      
       br.close();
        
    }
    
    
}

