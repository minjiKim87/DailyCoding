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

       TreeSet<String> l = new TreeSet<>();
       TreeSet<String> s = new TreeSet<>();

       for(int i =0;i<N;i++){
        String listen = br.readLine();
        l.add(listen);
       }
       for(int i=0;i<M;i++){

            String see = br.readLine();

            if(l.contains(see)){
                s.add(see);
            }
       }

       System.out.println(s.size());
       for(String str : s){
        System.out.println(str);
       }

      
       br.close();
        
    }
    
    
}

