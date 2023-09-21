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

       Queue<int[]> q = new LinkedList<>();
       boolean[] visited = new boolean[100001];

       q.offer(new int[]{N, 0});
       while(!q.isEmpty()){
        int[] check = q.poll();

        if(check[0]==M){
            System.out.println(check[1]);
            break;
        }

        if(check[0]-1>=0&&visited[check[0]-1]==false){
            q.offer(new int[]{(check[0]-1), check[1]+1});
            visited[check[0]-1] = true;
        }
        if(check[0]+1<=100000&&visited[check[0]+1]==false){
            q.offer(new int[]{(check[0]+1), check[1]+1});
            visited[check[0]+1] = true;
        }
        if(check[0]*2<=100000&&visited[check[0]*2]==false){
            q.offer(new int[]{check[0]*2, check[1]+1});
            visited[check[0]*2]=true;
        }

       }
      
       br.close();
        
    }
    
    
}

