import java.io.*;
import java.util.*;

public class Main{
    public static int[] arr, output;
    public static boolean[] visited;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       
       StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

       st = new StringTokenizer(br.readLine());
       arr = new int[N];
       output = new int[M];
       visited = new boolean[N];

       for(int i =0;i<N;i++){
        arr[i] = Integer.parseInt(st.nextToken());
       }
      
       Arrays.sort(arr);
       dfs(0, 0);
       System.out.println(sb);
       
       br.close();
        
    }

    public static void dfs(int at, int depth){
        if(depth==M){
            for(int i =0;i<M;i++){
                sb.append(output[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=0;i<N;i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth]=arr[i];
                dfs(i+1, depth+1);
                visited[i] =false;
            }
        }
    }
    
    
}

