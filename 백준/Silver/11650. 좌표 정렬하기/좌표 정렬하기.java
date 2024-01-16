import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       
       int[][] arr = new int[N][2];

       for(int i =0;i<N;i++){
        StringTokenizer st2 = new StringTokenizer(br.readLine());
       arr[i][0] = Integer.parseInt(st2.nextToken());
       arr[i][1] = Integer.parseInt(st2.nextToken());
       }

       Arrays.sort(arr, (a, b)->{
        if(a[0]==b[0]){
            return Integer.compare(a[1], b[1]);
        }
        return Integer.compare(a[0], b[0]);
       });

       for(int[] a:arr){
        System.out.println(a[0]+" "+a[1]);
       }
      
       br.close();
        
    }
    
    
}

