
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String str = sc.next();
            HashMap<String, List<String>> map = new HashMap<>();
            Boolean error = false;
            
          //  System.out.println(str);
            map.put("S", new ArrayList<>());
              map.put("D", new ArrayList<>());
              map.put("H", new ArrayList<>());
              map.put("C", new ArrayList<>());
            
            for(int i =0;i+2<=str.length();i+=3){
                String key = str.substring(i, i+1);
                String content = str.substring(i+1, i+3);
                //System.out.println(Key+Content);
                
                List<String> list = map.get(key);
                if(list.contains(content)){
                 System.out.println("#"+test_case+" ERROR");
                    error = true;
                    break;
                }else{
                 list.add(content);
                    map.put(key, list);
                }
                
                
            }
            
        //    System.out.println(map);
            if(!error){
                System.out.print("#"+test_case);
                System.out.print(" "+(13-map.get("S").size()));
                System.out.print(" "+(13-map.get("D").size()));
                System.out.print(" "+(13-map.get("H").size()));
                System.out.print(" "+(13-map.get("C").size()));
                System.out.println();
             
            }
   
		
		

		}
	}
}