import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
       
        
        for(int i =0;i<N;i++){
            String str = br.readLine();
            char[] s_char = str.toCharArray();
             Stack<Character> stack = new Stack<>();
            
            for(int j =0;j<str.length();j++){
               char c= s_char[j];
               if(c=='('){
                   stack.push(c);
               } else{
                   int size = stack.size();
                   if(size==0){
                       stack.push(c);
                       break;
                   }else{
                       stack.pop();
                   }
               }
         
            }
            
            
            if(stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            stack.clear();
            
            
            
        }
        
        
    }
    
}