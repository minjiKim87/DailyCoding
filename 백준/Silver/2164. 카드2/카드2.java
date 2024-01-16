import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
      
       Queue<Integer> queue = new LinkedList<>();
       for(int i =1;i<=N;i++){
        queue.add(i);
       }

       while(!queue.isEmpty()){
        //System.out.println(queue.peek());

        if(queue.size()==1){
            System.out.println(queue.poll());
            break;
        }
        else if(!queue.isEmpty()){
           // System.out.println("trash "+queue.peek());
            queue.poll();
        }
           
       if(queue.size()==1){
            System.out.println(queue.poll());
            break;
        }else if(!queue.isEmpty()){
            //System.out.println("down "+queue.peek());
            queue.add(queue.poll());
        }


       }


      
       br.close();
        
    }
    
    
}

