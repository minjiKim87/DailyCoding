import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());

       HashSet<Integer> numbers = new HashSet();

    
       StringTokenizer st2 =  new StringTokenizer(br.readLine());
       for(int i =0;i<N;i++){
            numbers.add(Integer.parseInt(st2.nextToken()));
       }
       StringTokenizer st3 = new StringTokenizer(br.readLine());
       int N2 = Integer.parseInt(st3.nextToken());
       StringTokenizer st4 =  new StringTokenizer(br.readLine());
       for(int i =0;i<N2;i++){
            if(numbers.contains(Integer.parseInt(st4.nextToken()))){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
       }
      
       br.close();
        
    }
    
    
}

