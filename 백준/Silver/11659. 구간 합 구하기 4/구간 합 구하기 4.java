import java.io.*;
import java.util.*;

public class  Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
      
       String[] strNum = br.readLine().split(" ");
    //    for(String s : strNum){
    //     System.out.print(s);
    //    }

        int[] num = new int[strNum.length];

        for(int i=0;i<num.length;i++){
            num[i] = Integer.valueOf(strNum[i]);
        }


        int[] preSum = new int[strNum.length+1];
        preSum[0] = 0;
        preSum[1] = num[0];

        for(int i =2;i<preSum.length;i++){
           
            preSum[i]+=preSum[i-1]+num[i-1];

            
        }
        // for(int p : preSum)
        //     System.out.print(p+", ");
        // System.out.println();
        //     //0, 5, 9, 12, 14, 15

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // System.out.println("a "+a+" b "+b+" "+preSum[b]+" "+preSum[a-1] );
           System.out.println(preSum[b]-preSum[a-1]);
      
        }
    }
    
    
}

