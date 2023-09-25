import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
      
       int N = Integer.valueOf(br.readLine());
       int M = Integer.valueOf(br.readLine());
       String S =br.readLine();
       String str="";
       for(int i =0;i<N;i++){
        str+="IO";
       }
       str+="I";
       //System.out.println("str "+str);

       int strLen = str.length();
       StringBuilder sb = new StringBuilder(S);
       int answer=0;

       for(int i =0;i<M-strLen;i++){
        //System.out.println(S.substring(i, i+strLen));
        if(S.substring(i, i+strLen).equals(str)){
            answer++;
        }
       }

       if(str.equals(S))
        answer++;
       
       System.out.println(answer);
       br.close();
        
    }
    
    
}

