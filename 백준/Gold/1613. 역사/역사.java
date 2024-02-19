import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());

       int map[][] = new int[n][n];
       int INF = 50000;
       
       for(int i=0;i<n;i++ ){
        Arrays.fill(map[i], INF);
       }

       for(int i =0;i<k;i++){
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())-1;
        int b = Integer.parseInt(st.nextToken())-1;

        map[a][b] = 1;
       }

    //    for(int i =0;i<n;i++){
    //     for(int j =0;j<n;j++){
    //         System.out.print(map[i][j]+" ");
    //     }
    //     System.out.println();
    //    }

       for(int m=0;m<n;m++){
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(map[i][j]==INF && map[i][m]+map[m][j]==2){
                    map[i][j] = 1;
                }
                
            }
        }
       }
       st = new StringTokenizer(br.readLine());
       int s = Integer.parseInt(st.nextToken());
       for(int i=0;i<s;i++){
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())-1;
        int b = Integer.parseInt(st.nextToken())-1;

        if(map[a][b]==1){
            System.out.println("-1");
        }else if(map[b][a]==1){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
       }


      
       br.close();
        
    }
    
    
}

