import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();

       int N = Integer.parseInt(br.readLine());
      
       int[][] time = new int[N][2];
       StringTokenizer st;

       for(int i = 0;i<N;i++){
        st = new StringTokenizer(br.readLine(), " ");
        time[i][0] = Integer.parseInt(st.nextToken());
        time[i][1] = Integer.parseInt(st.nextToken());

       }

       //종료시간을 전부 맞추고 가장 빨리끝나는것부터 선택
       Arrays.sort(time, (a, b)->{
        if(a[1]==b[1]){
            return a[0]-b[0];
        }else{
            return a[1]-b[1];
        }
       });

       //겹치는 회의는 안 선택
       int count = 0;
       int prev_end_time = 0;

       for(int i = 0;i<N;i++){
        if(prev_end_time<=time[i][0]){
            prev_end_time = time[i][1];
            count++;
        }
       }

       System.out.println(count);

      
       br.close();
        
    }
    
    
}

