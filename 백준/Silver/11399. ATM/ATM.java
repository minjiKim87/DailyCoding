import java.io.*;
import java.util.*;

public class Main {
 
    static int[] dist;

      
       public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        st = new StringTokenizer(br.readLine());
         
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for(int i =0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //누적합이 최소가 되도록? 그냥 계산하면 되는거 아닌가
        Arrays.sort(arr);

        int sum =0;

        for(int i =0;i<N;i++){
            for(int j =0;j<=i;j++){
                sum+=arr[j];
            }
        }
        
        System.out.println(sum);
 
    
        
    }

      
       

} 
