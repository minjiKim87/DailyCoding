import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
        int T = Integer.parseInt(br.readLine()); 

        for(int test_case = 0; test_case < T; test_case++) {
           String functions = br.readLine();

            int n = Integer.parseInt(br.readLine()); 
            
            String arrayString = br.readLine();
            arrayString = arrayString.substring(1, arrayString.length() - 1); 
            
            Deque<Integer> deque = new LinkedList<>(); 

            if(n > 0) {
                StringTokenizer st = new StringTokenizer(arrayString, ",");
                while(st.hasMoreTokens()) {
                    deque.add(Integer.parseInt(st.nextToken())); 
                }
            }

            boolean dir = true; 
            boolean errorFlag = false;
            for(int i =0;i<functions.length();i++){
                if(functions.charAt(i)=='R'){
                    dir = !dir;
                }else{
                    if(deque.isEmpty()){
                        System.out.println("error");
                        errorFlag = true;
                        break;
                       
                    }else{
                       if(dir){
                        deque.pollFirst();
                       }else{
                        deque.pollLast();
                       }
                    }
                }
            }

            if(!errorFlag){
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                while(!deque.isEmpty()){
                    sb.append(dir ? deque.pollFirst() : deque.pollLast());
                    if(!deque.isEmpty())
                        sb.append(",");
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
          

        }

        br.close();
    }
}
