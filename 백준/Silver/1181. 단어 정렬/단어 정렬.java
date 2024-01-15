import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());

        TreeMap<Integer, TreeSet<String>> map = new TreeMap<>();
       
       for(int i =0;i<N;i++){
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        String str = st2.nextToken();
        int n = str.length();

        if(map.containsKey(n)){
            map.get(n).add(str);

        }else{
            TreeSet<String> set = new TreeSet<>();
            set.add(str);
            map.put(n, set);
        }

       }

       for (TreeSet<String> valueSet : map.values()) {
        for (String value : valueSet) {
            System.out.println(value);
        }
    }


      
       br.close();
        
    }
    
    
}

