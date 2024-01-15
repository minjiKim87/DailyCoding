import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());

       Deque<Integer> deque = new LinkedList<>();
      
       for(int i =0;i<N;i++){
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        String command = st2.nextToken();
        
        switch (command){
            case "push":
                deque.add(Integer.valueOf(st2.nextToken()));
                break;
            case "pop":
                if(deque.isEmpty())
                    System.out.println("-1");
                else
                System.out.println(deque.poll());
                break;
            case "size":
                System.out.println(deque.size());
                break;
            case "empty":
                if(deque.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
                break;
            case "front" :
            if(deque.isEmpty())
                    System.out.println("-1");
                else
                System.out.println(deque.peekFirst());
            break;
            case "back" :
            if(deque.isEmpty())
            System.out.println("-1");
        else
            System.out.println(deque.peekLast());
        break;
        default:
        break;
            

        }
            

       }      
       br.close();
        
    }
    
    
}


