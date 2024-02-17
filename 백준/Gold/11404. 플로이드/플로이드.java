import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int[][] dist = new int[n + 1][n + 1];

        for(int i =1 ;i<=n;i++){
            for(int j =1 ;j<=n;j++){
                if(i==j) dist[i][j]=0;
                else dist[i][j] =  100000 * n;
            }
        }

        for(int i = 0 ;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            dist[a][b] = Math.min(dist[a][b], c);
        }

        for(int k =1;k<=n;k++){
            for(int i =1;i<=n;i++){
                for(int j =1;j<=n;j++){
                    dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
                }
            }
        }

        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(dist[i][j] >= 100000 * n) System.out.print("0 ");
                else System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }


    }
    
    
}

