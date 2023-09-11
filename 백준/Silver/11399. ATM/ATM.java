import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       int p = Integer.parseInt(br.readLine());
       List<Integer> list = new ArrayList<>();
         StringTokenizer st = new StringTokenizer(br.readLine());
       for(int i =0;i<p;i++){
      
        int N = Integer.parseInt(st.nextToken());
        list.add(N);
       }

       Collections.sort(list);

       int sum = 0;
        int answer = 0;
        for (int s : list) {
            sum += s;
            answer += sum;
        }

        System.out.println(answer);
       br.close();
        
    }
    
    
}

