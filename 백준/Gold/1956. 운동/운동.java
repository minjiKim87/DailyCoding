import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       int INF = 4000000;
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int V = Integer.parseInt(st.nextToken());
       int E = Integer.parseInt(st.nextToken());

       int[][] map = new int[V][V];
       for(int i =0;i<V;i++){
        Arrays.fill(map[i], INF);
        //map[i][i] = 0; <- 이걸 하면 안됨
       }

       for(int i =0;i<E;i++){
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken())-1;
        int b = Integer.parseInt(st.nextToken())-1;
        int c = Integer.parseInt(st.nextToken());

        map[a][b] = c;
       }

       for(int k = 0;k<V ; k++){
        for(int i =0;i<V;i++){
            //if(i==k) continue;
            for(int j =0;j<V;j++){
                //if(i==j||k==j)continue;
                map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
            }
        }
       }
    //    for(int i =0;i<V;i++){
    //     for(int j =0;j<V;j++){
    //         System.out.print(map[i][j]+" ");
    //     }
    //     System.out.println();
    //    }

       int minCycle = INF*2;
       for(int i =0;i<V;i++){
        for(int j = 0;j<V;j++){
            if(map[i][j]==INF || map[j][i]==INF) continue;
            if(i==j){
                minCycle = Math.min(minCycle, map[i][j]);
            }else{
                minCycle = Math.min(minCycle, map[i][j]+map[j][i]);
            }
        }
       }

       System.out.println(minCycle== INF*2 ? -1 : minCycle);



      
       br.close();
        
    }
    
    
}

