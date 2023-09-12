import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
   
       int T = Integer.parseInt(br.readLine());

       for(int i =0;i<T;i++){
        int N = Integer.parseInt(br.readLine());
        HashMap<String, List<String>> map = new HashMap<>();

        for(int j =0;j<N;j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String type = st.nextToken();

            List<String> currList = map.getOrDefault(type, new ArrayList<>());
            currList.add(name);
            map.put(type, currList);

        }
       
        int answer = 1;

        for(String key: map.keySet()){
            
            answer*=(map.get(key).size()+1);
            
        }
        
        answer--;
        
        System.out.println(answer);
        

       }
      
      
       br.close();
        
    }
    
    
}

